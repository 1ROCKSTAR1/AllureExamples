package test;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import page.AutorizationPage;

public class BuyTest {

    @Epic(value = "E2E tests")
    @Feature(value = "Buying an item")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Buying an item. From an autorization to an order. NEGATIVE.")
    @Test
    public void buyBackPackTest() {

        String finishBuyHeader = new AutorizationPage()
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .clickOnBackPack()
                .addBackPackToCart()
                .clickBackPackCartIcon()
                .clickCheckoutButton()
                .fillThefirstNameField()
                .fillThelastNameField()
                .fillThepostCodeField()
                .clickOnsumbitButton()
                .checkoutTitleCheck()
                .checkPaymentInfo()
                .checkShipInfo()
                .checkPrice()
                .finishButtonClick()
                .getFinishBuyHeader();

        Assertions.assertEquals("Thank you for order!",finishBuyHeader);
    }

    @Epic(value = "E2E tests")
    @Feature(value = "Buying an item")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Buying an item. From an autorization to an order.")
    @Test
    public void buyBikeLightTest() {

        String finishBuyHeader = new AutorizationPage()
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .clickOnBikeLight()
                .clickBikeLightCartIcon()
                .clickCheckoutButton()
                .fillThefirstNameField()
                .fillThelastNameField()
                .fillThepostCodeField()
                .clickOnsumbitButton()
                .checkoutTitleCheck()
                .checkPaymentInfo()
                .checkShipInfo()
                .checkPrice()
                .finishButtonClick()
                .getFinishBuyHeader();

        Assertions.assertEquals("Thank you for your order!",finishBuyHeader);
    }
}
