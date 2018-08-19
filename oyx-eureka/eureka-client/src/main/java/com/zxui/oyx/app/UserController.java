package com.zxui.oyx.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zxshen on 2018/8/18.
 */
@RestController
public class UserController {

    @GetMapping("/name")
    public String getUserName() {
        return "zhangSan";
    }
}
