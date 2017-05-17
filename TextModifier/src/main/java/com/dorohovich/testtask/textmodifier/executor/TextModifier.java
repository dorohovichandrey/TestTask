package com.dorohovich.testtask.textmodifier.executor;

import com.dorohovich.testtask.textmodifier.step.ModifyingStep;

/**
 * Created by Andrei_Darakhovich on 5/17/2017.
 */
public interface TextModifier {

    void addStepsChain(ModifyingStep... steps);
    String execute(String input);
}
