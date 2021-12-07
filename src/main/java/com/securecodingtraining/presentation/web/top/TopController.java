package com.securecodingtraining.presentation.web.top;

import com.securecodingtraining.domain.hello.HelloWorld;

import org.springframework.http.RequestEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TopController {

    @GetMapping("/hello")
    public RequestEntity<Void> index(){
        return HelloWorld.say();
    }

//    @PostMapping("/paintings")
//    public ResponseEntity<Void> createPainting(@ValidJson(PAINTING) Painting painting) {
//        ...
//    }
}
