package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class AutorizationPage {

    private SelenideElement usernameField = $x("//input[@id='user-name']");
    private SelenideElement passwordField = $x("//input[@id='password']");
    private SelenideElement submitButton = $x("//input[@id='login-button']");

    @Step("Filling a name")
    public AutorizationPage inputLogin() {
        usernameField.sendKeys("standard_user");
        return this;
    }

    @Step("Filling a password")
    public AutorizationPage inputPassword() {
        passwordField.sendKeys("secret_sauce");
        return this;
    }

    @Step("Click on submit")
    public GoodsPage clickSubmit() {
        submitButton.click();
        return new GoodsPage();
    }
}
