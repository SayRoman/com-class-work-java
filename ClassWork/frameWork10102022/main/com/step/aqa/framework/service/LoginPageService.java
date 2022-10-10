package com.step.aqa.framework.service;

import com.step.aqa.framework.page.LoginPage;
import com.step.aqa.framework.page.MainPage;
import com.step.aqa.framework.service.service_interface.HasLoginPage;

public class LoginPageService extends BaseService implements HasLoginPage {

    private LoginPage loginPage = new LoginPage();
    @Override
    public LoginPage getLoginPage() {
        return loginPage;
    }
}
