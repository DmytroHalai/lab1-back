package org.example.healthcheck.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/")
public class AppController {

    @RequestMapping("/healthcheck")
    public Date healthCheck() {
        return new Date();
    }
}
