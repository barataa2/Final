package PageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
        profileButton = $(".welcome-text-desktop"),
        emailLogin = $("#EmailOrPhone"),
        passLogin = $("#Password"),
        autButton = $("#login-btn");
}
