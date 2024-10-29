package com.ivan.langchaintest.controllers;

import dev.langchain4j.model.chat.ChatLanguageModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/assistant")
public class AssistantController {

    private ChatLanguageModel chatLanguageModel;

    public AssistantController(ChatLanguageModel chatLanguageModel) {
        this.chatLanguageModel = chatLanguageModel;
    }

    @GetMapping("/summaryTexts")
    public String summaryMultipleTextsIntoOne() {
        List<String> texts = new ArrayList<>();
        texts.add("J'ai un problème de communication avec mon directeur.");
        texts.add("Je n'arrive pas à négocier avec les clients le prix du nouvel ordinateur.");
        texts.add("Le prix des composants de l'ordinateur a explosé.");
        texts.add("Le camion qui devait transporter les composants est tombé en panne.");

        String input = "Est-ce que tu peux, à partir de ces phrases, me dire, en 1 phrase, pourquoi le projet a échoué.: " + String.join(" ", texts);

        return chatLanguageModel.generate(input);
    }
}
