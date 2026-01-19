package page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class AutorizationPage {

    private SelenideElement usernameField = $x("//input[@id='user-name']");
    private SelenideElement passwordField = $x("//input[@id='password']");
    private SelenideElement submitButton = $x("//input[@id='login-button']");

    public AutorizationPage inputLogin() {
        usernameField.sendKeys("standard_user");
        return this;
    }

    public AutorizationPage inputPassword() {
        passwordField.sendKeys("secret_sauce");
        return this;
    }

    public GoodsPage clickSubmit() {
        submitButton.click();
        return new GoodsPage();
    }
}
