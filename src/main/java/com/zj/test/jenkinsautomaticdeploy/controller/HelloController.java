package com.zj.test.jenkinsautomaticdeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* @author: zhoujian
 * @qq: 2025513
 * @create-time: 2021/1/27 13:15
 * @description:
 * @version: 1.0
 * @finished: false
 * @finished-time:
 */
@RestController
public class HelloController {

    /**
     * abcd
     */
    @RequestMapping("hello")
    public String test(){
        return "恭喜你! 你已经实现了自动化部署了";
    }
}
