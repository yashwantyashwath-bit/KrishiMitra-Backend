package com.krishimitra.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/organic")
@CrossOrigin
public class OrganicController {

    @GetMapping("/tips")
    public String tips() {
        return "Use vermicompost, neem oil, jeevamrutham, mulching and crop rotation.";
    }
}
