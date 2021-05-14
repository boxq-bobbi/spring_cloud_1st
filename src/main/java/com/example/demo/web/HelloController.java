package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Hello World
 * </p>
 *
 * @author boxingqi
 * @date 2021/5/14 10:16
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String index() {
        return "Hello World";
    }
}
