package com.docker.springboot.springbootwithdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DockerMessageController {

    @GetMapping("/messages")
    public String getMessage() {
        return "Receiving messages from Docker Controller!";
    }
}
