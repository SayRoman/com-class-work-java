package com.step.aqa.framework.page.block.login;

import com.step.aqa.framework.annotation.Block;
import com.step.aqa.framework.page.block.BaseBlock;
import com.step.aqa.framework.page.block_interface.login.HasLoginButtonElement;
import com.step.aqa.framework.page.block_interface.login.HasLoginFieldElement;
import com.step.aqa.framework.page.block_interface.login.HasPasswordFieldElement;
import com.step.aqa.framework.page.block_interface.login.HasRecoveryPasswordElement;
import com.step.aqa.framework.page.element.login.LoginButtonElement;
import com.step.aqa.framework.page.element.login.LoginFieldElement;
import com.step.aqa.framework.page.element.login.PasswordFieldElement;
import com.step.aqa.framework.page.element.login.RecoveryPasswordElement;

@Block(blockName = "Login Form block")
public class LoginFormBlock extends BaseBlock implements HasLoginButtonElement, HasLoginFieldElement, HasPasswordFieldElement,
        HasRecoveryPasswordElement {
    private LoginButtonElement loginButtonElement = new LoginButtonElement("selector for Login Button");
    private LoginFieldElement loginFieldElement = new LoginFieldElement("selector for Login Input");
    private PasswordFieldElement passwordFieldElement = new PasswordFieldElement("selector for Password input");
    private RecoveryPasswordElement recoveryPasswordElement = new RecoveryPasswordElement("selector for Recovery link");

    @Override
    public LoginButtonElement getLoginButtonElement() {
        return loginButtonElement;
    }

    @Override
    public LoginFieldElement getLoginFieldElement() {
        return loginFieldElement;
    }

    @Override
    public PasswordFieldElement getPasswordFieldElement() {
        return passwordFieldElement;
    }

    @Override
    public RecoveryPasswordElement getRecoveryPasswordElement() {
        return recoveryPasswordElement;
    }
}
