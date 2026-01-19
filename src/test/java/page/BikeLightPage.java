package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class BikeLightPage {

    private SelenideElement bikeLightItem = $x("//div[contains(@class,'inventory_details_name large_size')][contains(text(),'Sauce Labs Bike Light')]");
    private SelenideElement bikeLightDesc = $x("//div[contains(@class,'inventory_details_desc large_size')][contains(text(),'when riding your bike at night')]");
    private SelenideElement addToCartButton = $x("//button[@data-test='add-to-cart']");
    private SelenideElement backBikeLightCartIcon = $x("//a[@class='shopping_cart_link']");
    public String getBikeLightItem() {
        return bikeLightItem.getText();
    }

    public String getBikeLightDesc() {
        return bikeLightDesc.getText();
    }

    @Step("Click on add to cart button")
    public BikeLightPage addBikeLightToCart() {
        addToCartButton.click();
        return this;
    }

    @Step("Go to the cart with BackPack")
    public YourCartPage clickBikeLightCartIcon() {
        backBikeLightCartIcon.click();
        return new YourCartPage();
    }

}
