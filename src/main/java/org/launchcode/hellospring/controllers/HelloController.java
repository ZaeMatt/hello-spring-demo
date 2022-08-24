package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {
    //Handles requests at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello () {
//        return "Hello Spring!";
//    }
    // lives at /hello/goodbye
    @GetMapping("goodbye")
    public String goodbye () {
        return "Goodbye Spring!";
    }

    //Handles requests of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")

    public String helloWithQueryParam ( @RequestParam String name) {
        return "Hello, " + name + "!";
    }

    //Handles requests of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
    // lives at /hello/form
    @GetMapping("form")
    public String helloForm() {
        return "form";

    }

}
