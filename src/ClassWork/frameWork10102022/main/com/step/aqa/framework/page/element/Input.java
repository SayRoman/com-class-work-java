package ClassWork.frameWork10102022.main.com.step.aqa.framework.page.element;

import ClassWork.frameWork10102022.main.com.step.aqa.framework.annotation.Element;

public class Input extends BaseElement {

    @Element(elementName = "Input root element")
    public Input(String elementSelector) {
        super.elementSelector = elementSelector;
    }
}
