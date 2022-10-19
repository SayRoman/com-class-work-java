package ClassWork.frameWorkPracrice.Interface;

import frameWorkPracrice.Block.WindowOfRegistration;

public interface HasNickName {

    WindowOfRegistration getWindowReg ();

    default void verifyNickName () {
        if (getWindowReg().nickNameField.getName().equals("Name")){
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }
}
