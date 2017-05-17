package com.dorohovich.testtask.englishsimplifier.step;

import com.dorohovich.testtask.textmodifier.step.impl.ModifyingStepImpl;

/**
 * Created by Andrei_Darakhovich on 5/17/2017.
 */
public class RemoveArticlesStep extends ModifyingStepImpl {

    public RemoveArticlesStep() {
        super("(^|\\W)(the|an|a)(\\W(the|an|a))*(\\W|$)", group -> " ");
    }
}
