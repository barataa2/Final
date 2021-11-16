import PageObject.ItemsPage;
import StepObject.ItemsPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class ItemsPageTests extends ChromeRunner {
    @Test
        public void ItemsPageCases(){
        ItemsPageSteps steps = new ItemsPageSteps();
        ItemsPage obj = new ItemsPage();
        obj.cookieTitle.shouldBe(Condition.visible);
            steps

                .Close_cookies();
            steps
                .Add_Item_Cart()
                .Go_to_Cart()
                .Plus_quantity()
                .Minus_quantity()
                .Go_To_Cart()
                .Clear_cart()
                .Clear_cart_conf();
       // obj.cleanCartText.shouldBe(Condition.visible);
                sleep(5000);


    }
}
