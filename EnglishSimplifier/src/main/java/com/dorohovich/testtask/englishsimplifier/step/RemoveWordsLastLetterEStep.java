package com.dorohovich.testtask.englishsimplifier.step;

import com.dorohovich.testtask.textmodifier.step.impl.ModifyingStepImpl;

/**
 * Created by Andrei_Darakhovich on 5/17/2017.
 */
public class RemoveWordsLastLetterEStep extends ModifyingStepImpl {

    public RemoveWordsLastLetterEStep() {
        super("\\we(\\W|$)", group -> group.substring(0,1).concat(group.substring(2)));
    }
}
