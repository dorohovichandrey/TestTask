package com.dorohovich.testtask.textmodifier.executor;

import com.dorohovich.testtask.textmodifier.executor.impl.TextModifierImpl;
import com.dorohovich.testtask.textmodifier.step.ModifyingStep;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by Andrei_Darakhovich on 5/16/2017.
 */
public class TextModifierImplTest {

    @Test
    public void testExecute() throws Exception {
        ModifyingStep stepOne = Mockito.mock(ModifyingStep.class);
        Mockito.when(stepOne.execute("abc")).thenReturn("123");
        ModifyingStep stepTwo = Mockito.mock(ModifyingStep.class);
        Mockito.when(stepTwo.execute("123")).thenReturn("def");
        TextModifierImpl textModifierImpl = new TextModifierImpl();
        textModifierImpl.addStepsChain(stepOne, stepTwo);
        String actual = textModifierImpl.execute("abc");
        String expected = "def";
        Assert.assertEquals(expected, actual);
    }
}
