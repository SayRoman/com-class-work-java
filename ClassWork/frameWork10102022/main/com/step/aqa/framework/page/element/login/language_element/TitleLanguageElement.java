package com.step.aqa.framework.page.element.login.language_element;

import com.step.aqa.framework.annotation.Element;
import com.step.aqa.framework.page.element.Label;

public class TitleLanguageElement extends Label {

    @Element(elementName = "Title Language Element")
    public TitleLanguageElement(String elementSelector) {
        super(elementSelector);
    }
}
