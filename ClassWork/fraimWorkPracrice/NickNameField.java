package fraimWorkPracrice;

import fraimWorkPracrice.Block.WindowOFAuthorization;
import fraimWorkPracrice.Block.WindowOfRegistration;
import fraimWorkPracrice.Interface.HasNickName;

public class NickNameField extends BasePage implements HasNickName {


    @Override
    public WindowOfRegistration getWindowReg() {
        return new WindowOfRegistration();
    }
}
