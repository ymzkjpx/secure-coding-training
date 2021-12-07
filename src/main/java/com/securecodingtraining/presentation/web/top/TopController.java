package com.securecodingtraining.presentation.web.top;

import com.securecodingtraining.domain.hello.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TopController {

    @GetMapping("/hello")
    public String index() {
        return HelloWorld.say();
    }
}
