package com.ivan.langchaintest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assistant")
public class AssistantController {

    @GetMapping("/categorize")
    public String summaryMultipleTextsIntoOne(@RequestParam("query") String query) {
        return "";
    }
}
