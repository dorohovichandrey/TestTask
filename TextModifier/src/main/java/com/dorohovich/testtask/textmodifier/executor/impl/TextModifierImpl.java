package com.dorohovich.testtask.textmodifier.executor.impl;

import com.dorohovich.testtask.textmodifier.executor.TextModifier;
import com.dorohovich.testtask.textmodifier.step.ModifyingStep;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Andrei_Darakhovich on 5/16/2017.
 */
public class TextModifierImpl implements TextModifier {

    private List<ModifyingStep> stepsChain = new LinkedList<ModifyingStep>();

    public void addStepsChain(ModifyingStep... steps) {
        stepsChain.addAll(Arrays.asList(steps));
    }

    public String execute(String input){
        String buffer = input;
        for(ModifyingStep step : stepsChain){
            buffer = step.execute(buffer);
        }
        return buffer;
    }

}
