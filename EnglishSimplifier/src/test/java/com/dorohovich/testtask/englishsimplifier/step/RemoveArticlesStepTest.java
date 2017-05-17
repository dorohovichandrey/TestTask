package com.dorohovich.testtask.englishsimplifier.step;

import com.dorohovich.testtask.textmodifier.step.ModifyingStep;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Andrei_Darakhovich on 5/17/2017.
 */
public class RemoveArticlesStepTest extends AbstractStepTest {

    @Override
    protected ModifyingStep getStep() {
        return new RemoveArticlesStep();
    }

    @Test
    public void testExecuteSimpleCase(){
        checkByAssertEquals(" The  an  a ", "   ");
    }

    @Test
    public void testExecuteArticleRepeats(){
        checkByAssertEquals(" The an a the ", " ");
    }

    @Test
    public void testExecuteWithBeginOfString(){
        checkByAssertEquals("The an a the ", " ");
    }

    @Test
    public void testExecuteWithEndOfString(){
        checkByAssertEquals("The an nice a the", " nice ");
    }

    @Test
    public void testExecuteForCaseSensitive(){
        checkByAssertTrueWithEqualsIgnoreCase("The aN nIce a THE", " nice ");
    }

}
