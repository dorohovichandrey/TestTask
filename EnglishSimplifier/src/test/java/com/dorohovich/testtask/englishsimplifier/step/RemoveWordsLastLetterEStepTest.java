package com.dorohovich.testtask.englishsimplifier.step;

import com.dorohovich.testtask.textmodifier.step.ModifyingStep;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Andrei_Darakhovich on 5/17/2017.
 */
public class RemoveWordsLastLetterEStepTest extends AbstractStepTest {

    @Override
    protected ModifyingStep getStep() {
        return new RemoveWordsLastLetterEStep();
    }

    @Test
    public void testExecuteLetterEOnlyInTheEnd(){
        checkByAssertEquals("The te ", "Th t ");
    }

    @Test
    public void testExecuteLetterEEndOfLine(){
        checkByAssertEquals("ze", "z");
    }

    @Test
    public void testExecuteLetterERepeats(){
        checkByAssertEquals("eeee","eee");
    }

    @Test
    public void testExecuteWordLengthIsOne(){
        checkByAssertEquals("e e e","e e e");
    }

    @Test
    public void testExecuteForCaseSensitive() throws Exception {
        checkByAssertTrueWithEqualsIgnoreCase("ThE te E", "Th t e" );
    }
}


