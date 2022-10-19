package ClassWork.frameWorkPracrice.Block;

import ClassWork.frameWorkPracrice.Elements.CheckBox_RememberPassword;
import ClassWork.frameWorkPracrice.Elements.NickNameField;
import ClassWork.frameWorkPracrice.Elements.PasswordField;
import ClassWork.frameWorkPracrice.Elements.SubmitButton;
import ClassWork.frameWorkPracrice.Interface.HasPassword;

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
