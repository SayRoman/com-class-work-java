package com.step.aqa.framework.page.element.login;

import com.step.aqa.framework.annotation.Element;
import com.step.aqa.framework.page.element.Link;

public class RecoveryPasswordElement extends Link {

    @Element(elementName = "Recovery Password Element")
    public RecoveryPasswordElement(String elementSelector) {
        super(elementSelector);
    }
}
