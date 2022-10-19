package ClassWork.frameWork10102022.main.com.step.aqa.framework.page.element.login.language_element;

import ClassWork.frameWork10102022.main.com.step.aqa.framework.annotation.Element;
import ClassWork.frameWork10102022.main.com.step.aqa.framework.page.element.Link;

public class LanguageElement extends Link {

    @Element(elementName = "Language Element")
    public LanguageElement(String elementSelector) {
        super(elementSelector);
    }
}
