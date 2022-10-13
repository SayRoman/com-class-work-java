package com.step.aqa.framework.page.block_interface.login;

import com.step.aqa.framework.page.element.login.LoginButtonElement;

public interface HasLoginButtonElement {

    LoginButtonElement getLoginButtonElement();

    default void showLoginButtonElementSelector() {
        System.out.println(getLoginButtonElement().elementSelector);
    }
}
