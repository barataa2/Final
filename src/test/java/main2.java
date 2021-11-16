/*
import Facebook.Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class main2 extends ChromeRunner {

    @Test
    public void abc (){
        $(".btn-cart").click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $("#search_list").setValue("კომპიუტერი").pressEnter();
        $(".add_to_cart", 1).click();
        sleep(5000);
    }
    @Test
    public void negative(){
        $(byText("რეგისტრაცია")).click();
        $("#singup").shouldBe(Condition.disabled);
        $("#firstName").click();
        $("#lastName").click();
        $("#email").click();
        $("#password").click();
        $("#confirmPassword").click();
        $("#firstName").click();
        $(byText("სახელი სავალდებულოა")).shouldBe(Condition.visible);
        $(byText("გვარი სავალდებულოა")).shouldBe(Condition.visible);
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
        $("#email").setValue("test");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $("#email").setValue("@");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $("#email").setValue("gmail");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $("#email").setValue(".");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $("#password").setValue("12345");
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $("#password").setValue("6");
        $("#confirmPassword").setValue("123467");
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
        sleep(5000);
    }
}
*/
