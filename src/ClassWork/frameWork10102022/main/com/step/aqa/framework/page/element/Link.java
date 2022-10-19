package ClassWork.frameWork10102022.main.com.step.aqa.framework.page.element;

import ClassWork.frameWork10102022.main.com.step.aqa.framework.annotation.Element;

public class Link extends BaseElement {

    @Element(elementName = "Link root element")
    public Link(String elementSelector) {
        super.elementSelector = elementSelector;
    }
}
