package fraimWorkPracrice;

import fraimWorkPracrice.Block.WindowOfRegistration;
import fraimWorkPracrice.Interface.HasSubmitButton;

public class SubmitButtonPage extends BasePage implements HasSubmitButton {
    @Override
    public WindowOfRegistration getWindowReg() {
        return new WindowOfRegistration();
    }
}
