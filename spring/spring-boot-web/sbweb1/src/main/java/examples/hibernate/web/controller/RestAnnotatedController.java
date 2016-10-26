package examples.hibernate.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController  // [1]
public class RestAnnotatedController {

    @RequestMapping(value = "/hello")  // [2]
    public String hello(){
        return "Hey this is sample spring boot web application using @RestController";
    }

}
