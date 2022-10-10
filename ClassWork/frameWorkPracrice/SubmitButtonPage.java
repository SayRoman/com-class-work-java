package frameWorkPracrice;

import frameWorkPracrice.Block.WindowOfRegistration;
import frameWorkPracrice.Interface.HasSubmitButton;

public class SubmitButtonPage extends BasePage implements HasSubmitButton {
    @Override
    public WindowOfRegistration getWindowReg() {
        return new WindowOfRegistration();
    }
}
