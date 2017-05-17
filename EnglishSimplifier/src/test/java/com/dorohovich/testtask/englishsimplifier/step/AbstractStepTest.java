package com.dorohovich.testtask.englishsimplifier.step;

import com.dorohovich.testtask.textmodifier.step.ModifyingStep;
import org.junit.Assert;

/**
 * Created by Andrei_Darakhovich on 5/17/2017.
 */
public abstract class AbstractStepTest {

    protected abstract ModifyingStep getStep();

    protected void checkByAssertEquals(String input, String expectedResult){
        String actual = getStep().execute(input);
        Assert.assertEquals(expectedResult, actual);
    }

    protected void checkByAssertTrueWithEqualsIgnoreCase(String input, String expectedResult){
        String actual = getStep().execute(input);
        Assert.assertTrue(expectedResult.equalsIgnoreCase(actual));
    }

}
