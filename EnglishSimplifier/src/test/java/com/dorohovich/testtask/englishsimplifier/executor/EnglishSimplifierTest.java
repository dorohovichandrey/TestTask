package com.dorohovich.testtask.englishsimplifier.executor;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Andrei_Darakhovich on 5/17/2017.
 */
public class EnglishSimplifierTest {

    private EnglishSimplifier simplifier = new EnglishSimplifier();

    @Test
    public void testSimplifyOne(){
        checkByAssertEquals("the table", " tabl");
    }

    @Test
    public void testSimplifyTwo() throws Exception {
        checkByAssertEquals("the caacao a an and coffee",  " kakao and kofi");
    }


    @Test
    public void testSimplifyForCaseSensitive() throws Exception {
        checkByAssertTrueWithEqualsIgnoreCase("ThE cACAo a an and cofFEE",  " kakao and kofi");
    }

    private void checkByAssertEquals(String input, String expectedResult){
        String actual = simplifier.simplify(input);
        Assert.assertEquals(expectedResult, actual);
    }

    private void checkByAssertTrueWithEqualsIgnoreCase(String input, String expectedResult){
        String actual = simplifier.simplify(input);
        Assert.assertTrue(expectedResult.equalsIgnoreCase(actual));
    }

}
