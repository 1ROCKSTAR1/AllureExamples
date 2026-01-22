package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class HoodyPage {

    private SelenideElement hoodyPageItem = $x("//div[contains(@class,'inventory_details_name large_size')][contains(text(),'T-Shirt (Red)')]");
    private SelenideElement hoodyPageDesc = $x("//div[contains(@class,'inventory_details_desc large_size')][contains(text(),'Super-soft')]");

    @Step("Getting hoody's item name")
    public String getHoodyPageItem() {
        return hoodyPageItem.getText();
    }

    @Step("Getting hoody's description")
    public String getHoodyPageDesc() {
        return hoodyPageDesc.getText();
    }
}
