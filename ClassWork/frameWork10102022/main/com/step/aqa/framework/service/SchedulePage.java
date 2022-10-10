package com.step.aqa.framework.service;

import com.step.aqa.framework.service.service_interface.HasSchedulePage;

public class SchedulePage extends BaseService implements HasSchedulePage {

    private SchedulePage schedulePage = new SchedulePage();

    @Override
    public SchedulePage getSchedulePage() {
        return schedulePage;
    }
}
