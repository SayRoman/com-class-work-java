package ClassWork.frameWork10102022.main.com.step.aqa.framework.page.element.login;

import ClassWork.frameWork10102022.main.com.step.aqa.framework.annotation.Element;
import ClassWork.frameWork10102022.main.com.step.aqa.framework.page.element.Input;

public class PasswordFieldElement extends Input {

    @Element(elementName = "Password Field Element")
    public PasswordFieldElement(String elementSelector) {
        super(elementSelector);
    }
}
