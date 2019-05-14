#!/bin/sh
#
# Check the application status
#
# This function checks if the application is running

JAVA_HOME="/opt/jdk1.8.0_45/bin"
JAVA_PROC="-Dspring.profiles.active=pro"
AppFlag="push-controller"
JAR_FILE="/opt/wechat-pay/wechat-pay.jar"

# Check the application status. if running return pid else return 0
check_status() {

	s=`ps -ef|grep ${AppFlag}|grep -v grep|awk '{print $2}'`

	if [ $s ] ; then
		echo "$s"
		return
	fi

	echo "0"
	return
}

# Starts the application
start() {
	JAVA=${JAVA_HOME}/java
	ADDRESS=`ifconfig eth0 |awk -F '[ :]+' 'NR==2 {print $4}'`
	JAVA_OPS="-Dserver.address=${ADDRESS} -D${AppFlag}"

	pid=$(check_status)

	if [ $pid -ne 0 ] ; then
		echo "The application is already started"
		exit 1
	fi

	echo -n "Starting application: "
	${JAVA} -jar ${JAVA_PROC} ${JAVA_OPS} ${JAR_FILE} >> /dev/null 2>&1 &
	echo "OK"
}

# Stops the application
stop() {
	pid=$(check_status)

	if [ $pid -eq 0 ] ; then
		echo "Application is already stopped"
		return
		# exit 1
	fi

	echo -n "Stopping application: "
	kill -9 $pid &
	echo "OK"
}

# Show the application status
status() {
	pid=$(check_status)

	if [ ${pid} -ne 0 ] ; then
		echo "Application is started"
	else
		echo "Application is stopped"
	fi
}

case "$1" in
	start)
    	start
    	;;
	stop)
    	stop
		;;
	status)
		status
		;;
	restart|reload)
		stop
		start
		;;
	*)
    	echo "Usage: $0 {start|stop|restart|reload|status}"
		exit 1
esac

exit 0
