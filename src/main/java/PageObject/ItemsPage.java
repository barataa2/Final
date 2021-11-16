package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ItemsPage {
    public SelenideElement
        closeButton = $("#close-btn"),
        cookieTitle = $(".cookie-title"),
        addcartButton = $(".product_basket.not_for_mobile_basket"),
        cartButton = $(".header_basket.not_for_portrait_mobile.topcartlink.js-order-cart"),
        quantityUp = $(".quantity-button.quantity-up"),
        getQuantityDown = $(".quantity-button.quantity-down"),
        goToCart = $(".header_basket.not_for_portrait_mobile.topcartlink.js-order-cart"),
        clearCart = $("#clear-basket-button"),
        clearConfirmButton = $(".blue_button.confirm_button"),
        cleanCartText = $(By.xpath("/html/body/div[7]/section/div[4]/div[2]/div/div/div/div[1]"));
}
