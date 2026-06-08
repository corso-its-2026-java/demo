package com.its.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/demo")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/{nome}")
    public String helloUtente(@PathVariable String nome){
        return "Hello "+nome;
    }

    @GetMapping("/params")
    public String helloParams(@RequestParam String nome){
        return "Hello "+nome;
    }
}
