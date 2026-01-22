package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class GoodsPage {

    private SelenideElement bikeLightItem = $x("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Bike Light')]");
    private SelenideElement backPackItem = $x("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Backpack')]");
    private SelenideElement boltShirtItem = $x("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Bolt T-Shirt')]");
    private SelenideElement fleeceJacketItem = $x("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Fleece Jacket')]");
    private SelenideElement whiteShirtItem = $x("//div[contains(@class,'inventory_item_name')][contains(text(),'Sauce Labs Onesie')]");
    private SelenideElement hoodyItem = $x("//div[contains(@class,'inventory_item_name')][contains(text(),'T-Shirt (Red)')]");
    private SelenideElement afterLoginHeader = $x("//div[@class='app_logo']");

    @Step("Go to the Bikelight page")
    public BikeLightPage clickOnBikeLight() {
        bikeLightItem.click();
        return page(BikeLightPage.class);
    }

    @Step("Go to the Backpack's page")
    public BackPackPage clickOnBackPack() {
        backPackItem.click();
        return page(BackPackPage.class);
    }

    @Step("Go to the BoltShirt's page")
    public BoltShirtPage clickOnBoltShirt() {
        boltShirtItem.click();
        return page(BoltShirtPage.class);
    }

    @Step("Go to the FleeceJacket's page")
    public FleeceJacketPage clickOnFleeceJacket() {
        fleeceJacketItem.click();
        return page(FleeceJacketPage.class);
    }

    @Step("Go to the White shirt's page")
    public WhiteShirtPage clickOnWhiteShirt() {
        whiteShirtItem.click();
        return page(WhiteShirtPage.class);
    }

    @Step("Go to the Hoody's page")
    public HoodyPage clickOnHoody() {
        hoodyItem.click();
        return new HoodyPage();
    }

    @Step("Getting bikelight's item name")
    public String getBikeLightItem() {
        return bikeLightItem.getText();
    }

    @Step("Getting backpack's item name")
    public String getBackPackItem() {
        return backPackItem.getText();
    }

    @Step("Getting bolt's item name")
    public String getBoltShirtItem() {
        return boltShirtItem.getText();
    }

    @Step("Getting fleeceJacket's item name")
    public String getFleeceJacketItem() {
        return fleeceJacketItem.getText();
    }

    @Step("Getting whiteShirt's item name")
    public String getWhiteShirtItem() {
        return whiteShirtItem.getText();
    }

    @Step("Getting hoody's item name")
    public String getHoodyItem() {
        return hoodyItem.getText();
    }

    @Step("Getting loginHeader's text")
    public String getAfterLoginHeaderString() {
        return afterLoginHeader.getText();
    }
}
