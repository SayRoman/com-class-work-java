package ClassWork.frameWork10102022.main.com.step.aqa.framework.page.element.login;

import ClassWork.frameWork10102022.main.com.step.aqa.framework.annotation.Element;
import ClassWork.frameWork10102022.main.com.step.aqa.framework.page.element.Input;

public class LoginFieldElement extends Input {

    @Element(elementName = "Login Field Element")
    public LoginFieldElement(String elementSelector) {
        super(elementSelector);
    }
}
