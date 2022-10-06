package fraimWorkPracrice;

import fraimWorkPracrice.Block.WindowOFAuthorization;
import fraimWorkPracrice.Block.WindowOfRegistration;
import fraimWorkPracrice.Interface.HasPassword;

public class PasswordPage extends BasePage {

    public WindowOfRegistration getWinOfReg () {
        return new WindowOfRegistration();
    }
}
