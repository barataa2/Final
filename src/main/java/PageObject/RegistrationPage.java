package PageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage  {
    public   SelenideElement
        profileButton = $(".welcome-text-desktop"),
        registrationButton = $(".registration_link"),
        emailInput = $("#Email"),
        passwordInput = $("#register-password"),
        confirmPasswordInput = $("#ConfirmPassword"),
        checkmark = $(".checkmark.registration_checkmark"),
        regButton = $(".orange_btn.registration_button.js-register-btn");
}
