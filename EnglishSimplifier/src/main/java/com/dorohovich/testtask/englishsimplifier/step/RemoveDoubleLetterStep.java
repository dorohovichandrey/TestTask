package com.dorohovich.testtask.englishsimplifier.step;

import com.dorohovich.testtask.textmodifier.step.impl.ModifyingStepImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andrei_Darakhovich on 5/16/2017.
 */
public class RemoveDoubleLetterStep extends ModifyingStepImpl {

    public RemoveDoubleLetterStep() {
        super("oou|uoo|eei|iee|([a-z])\\1", new ReplacementProvider() {

            private Map<String, String> groupToReplacement = new HashMap<String, String>();
            {
                groupToReplacement.put("oo", "u");
                groupToReplacement.put("ee", "i");
                groupToReplacement.put("oou", "u");
                groupToReplacement.put("uoo", "u");
                groupToReplacement.put("iee", "i");
                groupToReplacement.put("eei", "i");
            }

            @Override
            public String provide(String group) {
                String result = groupToReplacement.get(group.toLowerCase());
                if(result == null){
                    result = group.substring(1);
                }
                return result;
            }
        });
    }
}
