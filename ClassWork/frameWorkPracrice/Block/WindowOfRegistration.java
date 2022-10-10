package frameWorkPracrice.Block;

import frameWorkPracrice.Elements.CheckBox_RememberPassword;
import frameWorkPracrice.Elements.NickNameField;
import frameWorkPracrice.Elements.PasswordField;
import frameWorkPracrice.Elements.SubmitButton;
import frameWorkPracrice.Interface.HasPassword;

public class WindowOfRegistration implements HasPassword {

    public CheckBox_RememberPassword checkBox_rememberPassword = new CheckBox_RememberPassword();
    public NickNameField nickNameField = new NickNameField();
    public PasswordField passwordField = new PasswordField();
    public SubmitButton submitButton = new SubmitButton();


    @Override
    public PasswordField getPasswordField() {
        return passwordField;
    }

}
