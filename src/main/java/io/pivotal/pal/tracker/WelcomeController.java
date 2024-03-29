package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private final String WELCOME_MESSAGE;

    public WelcomeController(
            @Value("${welcome.message}")String WELCOME_MESSAGE) {
        this.WELCOME_MESSAGE = WELCOME_MESSAGE;
    }

    @GetMapping("/")
    public String sayHello() {
        return WELCOME_MESSAGE;
    }
}