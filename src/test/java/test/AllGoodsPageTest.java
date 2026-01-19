package test;

import base.BaseTest;
import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import page.AutorizationPage;

public class AllGoodsPageTest extends BaseTest {

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Bike Light + the correctness of the description of this product.")
    @Test
    public void bikeLightHeaderTextTest() {
        String itemText = new AutorizationPage()
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .getBikeLightItem();

        Assertions.assertEquals("Sauce Labs Bike Light", itemText);
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Backpack + the correctness of the description of this product.")
    @Test
    public void backPackHeaderTextTest() {
        String itemText = new AutorizationPage()
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .getBackPackItem();

        Assertions.assertEquals("Sauce Labs Backpack", itemText);
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the T-Shirt + the correctness of the description of this product.")
    @Test
    public void boltTshirtHeaderTextTest() {
        String itemText = new AutorizationPage()
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .getBoltShirtItem();

        Assertions.assertEquals("Sauce Labs Bolt T-Shirt", itemText);
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Fleece jacket + the correctness of the description of this product.")
    @Test
    public void fleeceJacketHeaderTextTest() {
        String itemText = new AutorizationPage()
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .getFleeceJacketItem();

        Assertions.assertEquals("Sauce Labs Fleece Jacket", itemText);
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Onesie + the correctness of the description of this product.")
    @Test
    public void whiteShirtHeaderTextTest() {
        String itemText = new AutorizationPage()
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .getWhiteShirtItem();

        Assertions.assertEquals("Sauce Labs Onesie", itemText);
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the T-Shirt RED + the correctness of the description of this product.")
    @Test
    public void hoodyHeaderTextTest() {
        String itemText = new AutorizationPage()
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .getHoodyItem();

        Assertions.assertEquals("T-Shirt (Red)", itemText);
    }
}
