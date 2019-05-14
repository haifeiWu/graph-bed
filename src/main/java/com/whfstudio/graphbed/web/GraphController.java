package com.whfstudio.graphbed.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuhaifei 2019-05-13
 */
@RestController
@RequestMapping("/graph")
public class GraphController {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
    }
}
