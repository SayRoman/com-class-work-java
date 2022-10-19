package ClassWork.frameWork10102022.main.com.step.aqa.framework.service;

import ClassWork.frameWork10102022.main.com.step.aqa.framework.annotation.Service;
import com.step.aqa.framework.service.service_interface.HasSchedulePage;

@Service(serviceName = "Schedule page service")
public class SchedulePageService extends BaseService implements HasSchedulePage {

    private SchedulePageService schedulePage = new SchedulePageService();

    @Override
    public SchedulePageService getSchedulePage() {
        return schedulePage;
    }
}
