package com.soplab.lecture.factory;

import com.soplab.lecture.model.FishSashimi;
import com.soplab.lecture.model.MolluscaSashimi;
import com.soplab.lecture.model.Sashimi;

public class SashimiFactory {
    public static Sashimi getType(String sashimiType) {
        if (sashimiType.equalsIgnoreCase("fish")) {
            return new FishSashimi();
        }
        else if (sashimiType.equalsIgnoreCase("mollusca")) {
            return new MolluscaSashimi();
        }

        return new Sashimi();
    }
}
