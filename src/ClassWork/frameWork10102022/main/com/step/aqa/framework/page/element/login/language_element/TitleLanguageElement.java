package ClassWork.frameWork10102022.main.com.step.aqa.framework.page.element.login.language_element;

import ClassWork.frameWork10102022.main.com.step.aqa.framework.annotation.Element;
import ClassWork.frameWork10102022.main.com.step.aqa.framework.page.element.Label;

public class TitleLanguageElement extends Label {

    @Element(elementName = "Title Language Element")
    public TitleLanguageElement(String elementSelector) {
        super(elementSelector);
    }
}
