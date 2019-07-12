package com.whfstudio.graphbed.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuhaifei 2019-05-13
 */
@RestController
@RequestMapping("/v1")
public class GraphController {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
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
