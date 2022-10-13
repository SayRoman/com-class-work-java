package com.step.aqa.framework;

import com.step.aqa.framework.service.LoginPageService;

public class LoginPageTest {

    private LoginPageService loginPageService = new LoginPageService();

    public static void main (String[] args){
        LoginPageTest test = new LoginPageTest();
        test.checkLoginButton();
        test.checkLoginField();
        test.checkPasswordField();
        test.checkRecoveryPassword();
        test.checkLanguageElement();
        test.checkTitleLanguageElement();


    }

    public void checkPasswordField() {
        loginPageService.getLoginPage().getLoginFormBlock().showPasswordFieldElementSelector();
    }

    public void checkLoginField() {
        loginPageService.getLoginPage().getLoginFormBlock().showLoginFieldElementSelector();
    }

    public void checkLoginButton() {
        loginPageService.getLoginPage().getLoginFormBlock().showLoginButtonElementSelector();
    }

    public void checkRecoveryPassword (){
        loginPageService.getLoginPage().getLoginFormBlock().showRecoveryPasswordElementSelector();
    }

    public void checkLanguageElement(){
        loginPageService.getLoginPage().getLanguageBlock().getLanguageElement();
    }

    public void checkTitleLanguageElement(){
        loginPageService.getLoginPage().getLanguageBlock().showTitleLanguageElementSelector();
    }

}
