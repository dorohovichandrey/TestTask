package com.dorohovich.testtask.textmodifier.step;

import com.dorohovich.testtask.textmodifier.step.impl.ModifyingStepImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Andrei_Darakhovich on 5/16/2017.
 */
public class ModifyingStepImplTest {

    @Test
    public void testExecuteWithoutUsingGroupParam() throws Exception {
        ModifyingStepImpl step = new ModifyingStepImpl("1", group -> "2");
        String actual = step.execute("11111");
        String expected = "22222";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testExecuteWithUsingParam() throws Exception {
        ModifyingStepImpl step = new ModifyingStepImpl("1", group -> "8" + group);
        String actual = step.execute("111");
        String expected = "818181";
        Assert.assertEquals(expected, actual);
    }
}
