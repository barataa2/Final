import StepObject.RegistrationPageSteps;
import Utils.ChromeRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.RegistrationData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationPageTests extends ChromeRunner {

    @Test
    public void registationPositiveCases (){
        RegistrationPageSteps steps = new RegistrationPageSteps();
        steps
            .profileButton()
            .registrationButton()
            .emailInput(Email)
            .password(password)
            .confirmPassword(confpassword)
            .checkmark()
            .regButton();
            sleep (5000);
    }
}
