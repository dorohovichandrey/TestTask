package com.dorohovich.testtask.englishsimplifier.step;

import com.dorohovich.testtask.textmodifier.step.impl.ModifyingStepImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andrei_Darakhovich on 5/16/2017.
 */
public class RemoveLetterCStep extends ModifyingStepImpl {

    public RemoveLetterCStep() {
        super("c[iek]?", new ReplacementProvider() {

            private Map<String, String> groupToReplacement= new HashMap<String, String>();
            {
                groupToReplacement.put("ci", "si");
                groupToReplacement.put("ce", "se");
                groupToReplacement.put("ck", "k");
                groupToReplacement.put("c", "k");
            }

            @Override
            public String provide(String group) {
                return groupToReplacement.get(group.toLowerCase());
            }
        });
    }
}
