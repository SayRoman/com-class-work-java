package com.step.aqa.framework.page.block_interface.login;

import com.step.aqa.framework.page.element.login.RecoveryPasswordElement;

public interface HasRecoveryPasswordElement {

    RecoveryPasswordElement getRecoveryPasswordElement();

    default void showRecoveryPasswordElementSelector (){
        System.out.println(getRecoveryPasswordElement().elementSelector);
    }
}
