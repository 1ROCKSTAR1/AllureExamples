package page;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.$x;

public class AutorizationPage {

    private SelenideElement usernameField = $x("//input[@id='user-name']");
    private SelenideElement passwordField = $x("//input[@id='password']");
    private SelenideElement submitButton = $x("//input[@id='login-button']");

    @DisplayName("Filling a name")
    public AutorizationPage inputLogin() {
        usernameField.sendKeys("standard_user");
        return this;
    }

    @DisplayName("Filling a password")
    public AutorizationPage inputPassword() {
        passwordField.sendKeys("secret_sauce");
        return this;
    }

    @DisplayName("Click on submit")
    public GoodsPage clickSubmit() {
        submitButton.click();
        return new GoodsPage();
    }
}
