package com.whfstudio.graphbed.web;


import com.whfstudio.graphbed.common.model.GraphInfo;
import com.whfstudio.graphbed.service.DemoService;
import com.whfstudio.graphbed.service.GraphService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wuhaifei 2019-05-13
 */
@Slf4j
@RestController
@RequestMapping("/v1")
public class GraphController {

    @Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
    private DemoService demoService;

    @Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
    private GraphService graphService;

    @RequestMapping(value = "/hello")
    public String hello() {
        String hello = demoService.sayHello("");
        log.info("result : [{}]",hello);
        return hello;
    }

    @RequestMapping(value = "/list")
    public String list() {
        List<GraphInfo> graphInfoList = graphService.graphList();
        log.info("result : [{}]");
        return "hello";
    }

    @RequestMapping(value = "/rename")
    public String rename() {
        return "hello";
    }

    @RequestMapping(value = "/search")
    public String search() {
        return "hello";
    }

    @RequestMapping(value = "/upload")
    public String upload() {
        return "hello";
    }

}
