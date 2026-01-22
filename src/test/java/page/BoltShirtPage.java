package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
public class BoltShirtPage {

    private SelenideElement boltShirtItem = $x("//div[contains(@class,'inventory_details_name large_size')][contains(text(),'Sauce Labs Bolt T-Shirt')]");
    private SelenideElement boltShirtDesc = $x("//div[contains(@class,'inventory_details_desc large_size')][contains(text(),'Get your testing superhero')]");

    @Step("Getting bolt's item name")
    public String getBoltShirtItem() {
        return boltShirtItem.getText();
    }

    @Step("Getting bolt's item description")
    public String getBoltShirtDesc() {
        return boltShirtDesc.getText();
    }
}
