package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class WhiteShirtPage {

    private SelenideElement whiteShirtItem = $x("//div[contains(@class,'inventory_details_name large_size')][contains(text(),'Sauce Labs Onesie')]");
    private SelenideElement whiteShirtDesc = $x("//div[contains(@class,'inventory_details_desc large_size')][contains(text(),'Rib snap infant onesie for the junior automation engineer')]");

    @Step("Getting white shirt's item name")
    public String getWhiteShirtItem() {
        return whiteShirtItem.getText();
    }

    @Step("Getting white shirt's description")
    public String getWhiteShirtDesc() {
        return whiteShirtDesc.getText();
    }
}
