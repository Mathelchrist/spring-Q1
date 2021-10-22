package com.challengeQ1.quest1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {


    @GetMapping("/doctor/1")
    @ResponseBody
    public String william() {
        return "William Hartnell     <ul><li><a href=\"/\">index</a></li>\n</ul>";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String david() {
        return "David Tennant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String jodie() {
        return "Jodie Whittaker";
    }
}
