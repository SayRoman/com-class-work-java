package com.step.aqa.framework.service;

import com.step.aqa.framework.page.MainPage;
import com.step.aqa.framework.service.service_interface.HasMainPage;

public class MainPageService extends BaseService implements HasMainPage {
    private MainPage mainPage = new MainPage();

    @Override
    public MainPage getMainPage() {
        return mainPage;
    }
}
