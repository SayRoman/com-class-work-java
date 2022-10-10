package com.step.aqa.framework.page.element.login;

import com.step.aqa.framework.annotation.Element;
import com.step.aqa.framework.page.element.Button;

public class LoginButtonElement extends Button {

    @Element(elementName = "Login Button Element")
    public LoginButtonElement(String elementSelector) {
        super(elementSelector);
    }
}
