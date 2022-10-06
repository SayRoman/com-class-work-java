package fraimWorkPracrice;

import fraimWorkPracrice.Block.WindowOfRegistration;
import fraimWorkPracrice.Interface.HasCheckBox;

public class CheckBoxField extends BasePage implements HasCheckBox {

    @Override
    public WindowOfRegistration getWindowReg() {
        return new WindowOfRegistration();
    }
}
