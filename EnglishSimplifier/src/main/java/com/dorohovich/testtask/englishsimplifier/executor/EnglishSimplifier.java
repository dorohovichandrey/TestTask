package com.dorohovich.testtask.englishsimplifier.executor;

import com.dorohovich.testtask.englishsimplifier.config.EnglishSimplifierConfig;
import com.dorohovich.testtask.englishsimplifier.step.RemoveArticlesStep;
import com.dorohovich.testtask.englishsimplifier.step.RemoveDoubleLetterStep;
import com.dorohovich.testtask.englishsimplifier.step.RemoveLetterCStep;
import com.dorohovich.testtask.englishsimplifier.step.RemoveWordsLastLetterEStep;
import com.dorohovich.testtask.textmodifier.executor.TextModifier;
import com.dorohovich.testtask.textmodifier.executor.impl.TextModifierImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Andrei_Darakhovich on 5/16/2017.
 */
public class EnglishSimplifier{

    private TextModifier textModifier;

    public EnglishSimplifier() {
        ApplicationContext context = new AnnotationConfigApplicationContext(EnglishSimplifierConfig.class);
        textModifier = (TextModifier) context.getBean("textModifier");
    }

    public String simplify(String text){
        return textModifier.execute(text);
    }

}
