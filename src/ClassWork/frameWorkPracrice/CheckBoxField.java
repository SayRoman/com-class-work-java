package ClassWork.frameWorkPracrice;

import frameWorkPracrice.Block.WindowOfRegistration;
import frameWorkPracrice.Interface.HasCheckBox;

public class CheckBoxField extends BasePage implements HasCheckBox {

    @Override
    public WindowOfRegistration getWindowReg() {
        return new WindowOfRegistration();
    }
}
