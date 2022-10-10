package com.step.aqa.framework.page.element.login;

import com.step.aqa.framework.annotation.Element;
import com.step.aqa.framework.page.element.Input;

public class PasswordFieldElement extends Input {

    @Element(elementName = "Password Field Element")
    public PasswordFieldElement(String elementSelector) {
        super(elementSelector);
    }
}
