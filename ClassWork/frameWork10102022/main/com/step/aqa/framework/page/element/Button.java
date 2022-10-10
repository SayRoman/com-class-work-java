package com.step.aqa.framework.page.element;

import com.step.aqa.framework.annotation.Element;

public class Button extends BaseElement {

    @Element(elementName = "Button root element")
    public Button(String elementSelector) {
        super.elementSelector = elementSelector;
    }
}
