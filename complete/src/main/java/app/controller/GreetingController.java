package app.controller;

import app.form.Greeting;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public Greeting greeting(@Validated Greeting greeting, BindingResult result) {
        if (result.hasErrors()) System.out.println("error!");

        return greeting;
    }

}
