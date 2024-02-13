package com.woongsworld.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CommunityController {

    @GetMapping("/community")
    public String communityInit() {
        return "community init";
    }
}
