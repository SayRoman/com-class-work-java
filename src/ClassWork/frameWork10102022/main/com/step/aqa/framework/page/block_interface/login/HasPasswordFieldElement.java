package ClassWork.frameWork10102022.main.com.step.aqa.framework.page.block_interface.login;

import com.step.aqa.framework.page.element.login.PasswordFieldElement;

public interface HasPasswordFieldElement {

    PasswordFieldElement getPasswordFieldElement();

    default void showPasswordFieldElementSelector() {
        System.out.println(getPasswordFieldElement().elementSelector);
    }
}
