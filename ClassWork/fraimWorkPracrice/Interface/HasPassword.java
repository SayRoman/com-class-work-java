package fraimWorkPracrice.Interface;

import fraimWorkPracrice.Block.WindowOfRegistration;
import fraimWorkPracrice.Elements.PasswordField;

public interface HasPassword {

    PasswordField getPasswordField ();

    default void verifyPassword () {
        if (getPasswordField().getInfo().equals("null")){
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }
}
