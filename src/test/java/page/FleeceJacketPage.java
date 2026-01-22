package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class FleeceJacketPage {

    private SelenideElement fleeceJacketItem = $x("//div[contains(@class,'inventory_details_name large_size')][contains(text(),'Sauce Labs Fleece Jacket')]");
    private SelenideElement fleeceJacketDesc = $x("//div[contains(@class,'inventory_details_desc large_size')][contains(text(),'relaxing day outdoors')]");

    @Step("Getting fleeceJacket's item name")
    public String getFleeceJacketItem() {
        return fleeceJacketItem.getText();
    }

    @Step("Getting fleeceJacket's description")
    public String getFleeceJacketDesc() {
        return fleeceJacketDesc.getText();
    }
}
