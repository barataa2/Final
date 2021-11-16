
package StepObject;

import PageObject.RegistrationPage;
import io.qameta.allure.Step;

public class RegistrationPageSteps extends RegistrationPage {
    @Step("ClickProfile Button")
    public RegistrationPageSteps profileButton() {
        profileButton.click();
        return this;
    }
    @Step("ClickRegButton")
    public RegistrationPageSteps registrationButton(){
        registrationButton.click();
        return this;
    }
    @Step("email input")
    public RegistrationPageSteps emailInput(String s){
        emailInput.setValue(s);
        return this;
    }
    @Step("Password input")
    public RegistrationPageSteps password (String password){
        passwordInput.setValue(password);
        return this;
    }
    @Step("Confirm Password")
    public RegistrationPageSteps confirmPassword (String confirmPassword){
        confirmPasswordInput.setValue(confirmPassword);
        return this;
    }
    @Step("Checkmark password")
    public RegistrationPageSteps checkmark(){
        checkmark.click();
        return this;
    }
    @Step("Click Reg Button")
    public RegistrationPageSteps regButton(){
        regButton.click();
        return this;
    }
}

