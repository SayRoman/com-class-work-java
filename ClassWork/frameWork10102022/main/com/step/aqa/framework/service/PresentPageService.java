package com.step.aqa.framework.service;

import com.step.aqa.framework.annotation.Service;
import com.step.aqa.framework.service.service_interface.HasPresentPage;

@Service(serviceName = "Present Page service")
public class PresentPageService extends BaseService implements HasPresentPage {

    private PresentPageService presentPageService = new PresentPageService();

    @Override
    public PresentPageService getPresentPage() {
        return presentPageService;
    }
}
