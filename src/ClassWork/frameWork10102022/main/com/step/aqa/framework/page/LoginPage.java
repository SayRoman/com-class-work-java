package ClassWork.frameWork10102022.main.com.step.aqa.framework.page;

import ClassWork.frameWork10102022.main.com.step.aqa.framework.annotation.Page;
import com.step.aqa.framework.page.block.login.LanguageBlock;
import com.step.aqa.framework.page.block.login.LoginFormBlock;
import ClassWork.frameWork10102022.main.com.step.aqa.framework.page.block_interface.login.HasLanguageBlock;
import ClassWork.frameWork10102022.main.com.step.aqa.framework.page.block_interface.login.HasLoginFormBlock;

@Page(pageName = "Login page")
public class LoginPage extends BasePage implements HasLanguageBlock, HasLoginFormBlock {

    private LanguageBlock languageBlock = new LanguageBlock();
    private LoginFormBlock loginFormBlock = new LoginFormBlock();

    @Override
    public LanguageBlock getLanguageBlock() {
        return languageBlock;
    }

    @Override
    public LoginFormBlock getLoginFormBlock() {
        return loginFormBlock;
    }
}
