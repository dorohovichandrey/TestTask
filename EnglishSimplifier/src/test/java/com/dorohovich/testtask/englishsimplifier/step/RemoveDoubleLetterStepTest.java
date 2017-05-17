package com.dorohovich.testtask.englishsimplifier.step;

import com.dorohovich.testtask.textmodifier.step.ModifyingStep;
import org.junit.Test;

/**
 * Created by Andrei_Darakhovich on 5/16/2017.
 */
public class RemoveDoubleLetterStepTest extends AbstractStepTest {

    @Override
    protected ModifyingStep getStep() {
        return new RemoveDoubleLetterStep();
    }

    @Test
    public void testExecuteCheckDoubleLetter() {
        checkByAssertEquals("aacbb", "acb");
    }

    @Test
    public void testExecuteCheckMoreRepeatsThenTwice() {
        checkByAssertEquals("aaaaacbb", "aaacb");
    }

    @Test
    public void testExecuteForCaseSensitive() {
        checkByAssertTrueWithEqualsIgnoreCase("aAcBb", "acb");
    }

    @Test
    public void testExecuteForSpecialCasesUAndI() {
        checkByAssertEquals("eei iee oou uoo", "i i u u");
    }
}
