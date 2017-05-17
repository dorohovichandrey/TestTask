package com.dorohovich.testtask.textmodifier.step.impl;

import com.dorohovich.testtask.textmodifier.step.ModifyingStep;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Andrei_Darakhovich on 5/16/2017.
 */
public class ModifyingStepImpl implements ModifyingStep{

    private Pattern pattern;
    private ReplacementProvider replacementProvider;

    public ModifyingStepImpl(String regex, ReplacementProvider replacementProvider) {
        pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        this.replacementProvider = replacementProvider;
    }

    public String execute(String input){
        Matcher m = pattern.matcher(input);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            String group = m.group();
            String replacement = replacementProvider.provide(group);
            m.appendReplacement(sb,replacement);
        }
        m.appendTail(sb);
        return sb.toString();
    }

    public interface ReplacementProvider {
        String provide(String group);
    }

}
