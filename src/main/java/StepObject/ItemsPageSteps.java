package StepObject;

import PageObject.ItemsPage;

import io.qameta.allure.Step;

public class ItemsPageSteps extends ItemsPage {
    @Step("Close cookies pop up")
    public ItemsPageSteps Close_cookies(){
        closeButton.click();
        return this;
    }
    @Step("Add Item")
    public ItemsPageSteps Add_Item_Cart(){
        addcartButton.click();
        return this;
    }
    public ItemsPageSteps Go_to_Cart(){
        cartButton.click();
        return this;
    }
    public ItemsPageSteps Plus_quantity(){
        quantityUp.click();
        return this;
    }
    public ItemsPageSteps Minus_quantity(){
        getQuantityDown.click();
        return this;
    }
    public ItemsPageSteps Go_To_Cart(){
        goToCart.click();
        return this;
    }
    public ItemsPageSteps Clear_cart(){
        clearCart.click();
        return this;
    }
    public ItemsPageSteps Clear_cart_conf(){
        clearConfirmButton.click();
        return this;
    }
}
