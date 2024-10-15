package com.ivan.langchaintest.controllers;

import dev.langchain4j.model.chat.ChatLanguageModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assistant")
public class AssistantController {

    private ChatLanguageModel chatLanguageModel;

    public AssistantController(ChatLanguageModel chatLanguageModel) {
        this.chatLanguageModel = chatLanguageModel;
    }

    @GetMapping("/categorize")
    public String summaryMultipleTextsIntoOne() {
        return chatLanguageModel.generate("Hello Gemini!");
    }
}
