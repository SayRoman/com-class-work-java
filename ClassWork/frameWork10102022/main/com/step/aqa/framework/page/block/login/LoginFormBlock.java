package com.step.aqa.framework.page.block.login;

import com.step.aqa.framework.annotation.Block;
import com.step.aqa.framework.page.block.BaseBlock;
import com.step.aqa.framework.page.element.login.LoginButtonElement;
import com.step.aqa.framework.page.element.login.LoginFieldElement;
import com.step.aqa.framework.page.element.login.PasswordFieldElement;
import com.step.aqa.framework.page.element.login.RecoveryPasswordElement;

@Block(blockName = "Login Form block")
public class LoginFormBlock extends BaseBlock {
    private LoginButtonElement loginButtonElement = new LoginButtonElement("selector for Login Button");
    private LoginFieldElement loginFieldElement = new LoginFieldElement("selector for Login Input");
    private PasswordFieldElement passwordFieldElement = new PasswordFieldElement("selector for Password input");
    private RecoveryPasswordElement recoveryPasswordElement = new RecoveryPasswordElement("selector for Recovery link");
}
