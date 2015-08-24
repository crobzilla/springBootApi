package com.crobzilla.api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/")
public class StatusController {

    @RequestMapping("/status")
    public String index() {
        return "Up and running";
    }

}
