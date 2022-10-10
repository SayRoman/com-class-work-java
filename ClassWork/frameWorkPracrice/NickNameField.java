package frameWorkPracrice;

import frameWorkPracrice.Block.WindowOfRegistration;
import frameWorkPracrice.Interface.HasNickName;

public class NickNameField extends BasePage implements HasNickName {


    @Override
    public WindowOfRegistration getWindowReg() {
        return new WindowOfRegistration();
    }
}
