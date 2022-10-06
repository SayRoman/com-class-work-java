package fraimWorkPracrice.Block;

import fraimWorkPracrice.Elements.CheckBox_RememberPassword;
import fraimWorkPracrice.Elements.NickNameField;
import fraimWorkPracrice.Elements.PasswordField;
import fraimWorkPracrice.Elements.SubmitButton;
import fraimWorkPracrice.Interface.HasPassword;

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
