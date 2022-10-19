package ClassWork.frameWork10102022.main.com.step.aqa.framework.service;

import ClassWork.frameWork10102022.main.com.step.aqa.framework.annotation.Service;
import com.step.aqa.framework.page.MainPage;
import com.step.aqa.framework.service.service_interface.HasMainPage;

@Service(serviceName = "Main Page service")
public class MainPageService extends BaseService implements HasMainPage {
    private MainPage mainPage = new MainPage();

    @Override
    public MainPage getMainPage() {
        return mainPage;
    }
}
