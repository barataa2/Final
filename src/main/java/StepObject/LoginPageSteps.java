package StepObject;

import DataObject.LoginData;
import PageObject.LoginPage;
import io.qameta.allure.Step;

public class LoginPageSteps extends LoginPage {
    @Step("Profile Button")
    public LoginPageSteps Profile_Button(){
        profileButton.click();
        return this;
    }
    @Step("Email Input")
    public LoginPageSteps EmailLogin(String email_Login){
        emailLogin.setValue(email_Login);
        return this;
    }
    @Step("Password Input")
    public LoginPageSteps passLogin(String pass_Login){
        passLogin.setValue(pass_Login);
        return this;
    }
    @Step("Autorisation Button")
    public LoginPageSteps authLogin(){
        autButton.click();
        return this;
    }
}
