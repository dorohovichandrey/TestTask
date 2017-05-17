package com.dorohovich.testtask.englishsimplifier.config;

import com.dorohovich.testtask.englishsimplifier.step.RemoveArticlesStep;
import com.dorohovich.testtask.englishsimplifier.step.RemoveDoubleLetterStep;
import com.dorohovich.testtask.englishsimplifier.step.RemoveLetterCStep;
import com.dorohovich.testtask.englishsimplifier.step.RemoveWordsLastLetterEStep;
import com.dorohovich.testtask.textmodifier.executor.TextModifier;
import com.dorohovich.testtask.textmodifier.executor.impl.TextModifierImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Andrei_Darakhovich on 5/17/2017.
 */
@Configuration
public class EnglishSimplifierConfig {

    @Bean
    public TextModifier textModifier(){
        TextModifier textModifier = new TextModifierImpl();
        textModifier.addStepsChain(
                new RemoveArticlesStep(),
                new RemoveLetterCStep(),
                new RemoveDoubleLetterStep(),
                new RemoveWordsLastLetterEStep()
        );
        return textModifier;
    }
}
