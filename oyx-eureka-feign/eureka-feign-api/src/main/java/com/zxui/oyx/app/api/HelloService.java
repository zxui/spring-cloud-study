package com.zxui.oyx.app.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface HelloService {

    @GetMapping("/hello")
    String hello(@RequestParam(value = "name") String name);

}
