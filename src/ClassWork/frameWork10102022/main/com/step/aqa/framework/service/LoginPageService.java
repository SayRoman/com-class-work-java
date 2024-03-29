package ClassWork.frameWork10102022.main.com.step.aqa.framework.service;

import ClassWork.frameWork10102022.main.com.step.aqa.framework.annotation.Service;
import com.step.aqa.framework.page.LoginPage;
import com.step.aqa.framework.page.MainPage;
import com.step.aqa.framework.service.service_interface.HasLoginPage;

@Service(serviceName = "Login Page service")
public class LoginPageService extends BaseService implements HasLoginPage {

    private LoginPage loginPage = new LoginPage();
    @Override
    public LoginPage getLoginPage() {
        return loginPage;
    }
}
