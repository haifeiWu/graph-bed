package com.whfstudio.graphbed.web;

import com.whfstudio.graphbed.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuhaifei 2019-05-13
 */
@RestController
@RequestMapping("/v1")
public class GraphController {

    @Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
    private DemoService demoService;

    @RequestMapping(value = "/hello")
    public String hello() {
        String hello = demoService.sayHello("");
        return hello;
    }

    @RequestMapping(value = "/list")
    public String list() {
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
