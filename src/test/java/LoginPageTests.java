import PageObject.LoginPage;
import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static DataObject.LoginData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginPageTests extends ChromeRunner {
    @Test
        public void LoginPossitiveCases(){
        LoginPageSteps steps = new LoginPageSteps();
            steps
                    .Profile_Button()
                    .EmailLogin(email)
                    .passLogin(loginPassword)
                    .authLogin();
                    sleep(5000);
    }
}
