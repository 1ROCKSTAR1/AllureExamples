package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class CompletePage {

    private SelenideElement finishBuyHeader = $x("//h2[@class='complete-header'][contains(text(),'Thank you for your order!')]");

    @Step("Getting header's text")
    public String getFinishBuyHeader() {
        return finishBuyHeader.getText();
    }
}
