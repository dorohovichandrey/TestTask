package com.dorohovich.testtask.englishsimplifier.step;

import com.dorohovich.testtask.textmodifier.step.ModifyingStep;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Andrei_Darakhovich on 5/16/2017.
 */
public class RemoveLetterCStepTest extends AbstractStepTest {


    @Override
    protected ModifyingStep getStep() {
        return new RemoveLetterCStep();
    }

    @Test
    public void testExecuteCheckCkAndSe(){
        checkByAssertEquals("success", "suksess");
    }

    @Test
    public void testExecuteCheckCck(){
        checkByAssertEquals("cck", "kk");
    }

    @Test
    public void testExecuteForCaseSensitive(){
        checkByAssertTrueWithEqualsIgnoreCase("suCCeSs", "suksess");
    }
}
