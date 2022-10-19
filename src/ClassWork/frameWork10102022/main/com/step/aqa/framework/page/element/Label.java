package ClassWork.frameWork10102022.main.com.step.aqa.framework.page.element;

import ClassWork.frameWork10102022.main.com.step.aqa.framework.annotation.Element;

public class Label extends BaseElement {

    @Element(elementName = "Label root element")
    public Label(String elementSelector) {
        super.elementSelector = elementSelector;
    }
}
