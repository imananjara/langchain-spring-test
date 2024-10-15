package com.ivan.langchaintest.config;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AIToolsConfiguration {
    @Bean
    public ChatLanguageModel chatLanguageModel(
            @Value("${langchain.gemini.api.key}") String apiKey,
            @Value("${langchain.gemini.model.name}") String modelName) {
        return GoogleAiGeminiChatModel.builder()
                .apiKey(apiKey)
                .modelName(modelName)
                .build();
    }

}
