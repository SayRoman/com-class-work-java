package frameWorkPracrice.Interface;

import frameWorkPracrice.Block.WindowOfRegistration;

public interface HasCheckBox {
    WindowOfRegistration getWindowReg ();

    default void verifyCheckBox (){
        if (getWindowReg().checkBox_rememberPassword.getNumber() == 10) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }
}
