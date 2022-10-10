package com.step.aqa.framework.page.element;

import com.step.aqa.framework.annotation.Element;

public class Input extends BaseElement {

    @Element(elementName = "Input root element")
    public Input(String elementSelector) {
        super.elementSelector = elementSelector;
    }
}
