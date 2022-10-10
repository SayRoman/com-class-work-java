package com.step.aqa.framework.service;

import com.step.aqa.framework.service.service_interface.HasPresentPage;

public class PresentPageService extends BaseService implements HasPresentPage {

    private PresentPageService presentPageService = new PresentPageService();

    @Override
    public PresentPageService getPresentPage() {
        return presentPageService;
    }
}
