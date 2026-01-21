package test;

import base.BaseTest;
import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import page.AutorizationPage;

import java.util.NoSuchElementException;

public class DataProviderTest extends BaseTest {

    @Epic(value = "Проверки полей")
    @CsvFileSource(resources = "/data/data.csv")
    @Feature(value = "Данные покупателя")
    @Story(value = "Проверки полей страницы заполнения данных юзера")
    @Severity(value = SeverityLevel.NORMAL)
    @Description(value = "Проверка поля NAME на граничные значения и спецсимволы ....")
    @ParameterizedTest(name = "Checking the field 'name' with the value {0}")
    public void theFirstDataProviderTest(String option) throws NoSuchElementException {

        String checkoutTitle = new AutorizationPage()
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .clickOnBackPack()
                .addBackPackToCart()
                .clickBackPackCartIcon()
                .clickCheckoutButton()
                .fillThefirstNameFieldDP(option)
                .fillThelastNameField()
                .fillThepostCodeField()
                .clickOnsumbitButton()
                .getCheckoutHeaderPresence();

        Assertions.assertEquals("Checkout: Overview", checkoutTitle);
    }

    @Epic(value = "Проверки полей")
    @CsvFileSource(resources = "/data/data.csv")
    @Feature(value = "Данные покупателя")
    @Story(value = "Проверки полей страницы заполнения данных юзера")
    @Severity(value = SeverityLevel.NORMAL)
    @Description(value = "Проверка поля LASTNAME на граничные значения и спецсимволы ....")
    @ParameterizedTest(name = "Checking the field 'last name' with the value {0}")
    public void theFirstDataProviderTest2(String option) throws NoSuchElementException {

        String checkoutTitle = new AutorizationPage()
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .clickOnBackPack()
                .addBackPackToCart()
                .clickBackPackCartIcon()
                .clickCheckoutButton()
                .fillThefirstNameField()
                .fillThelastNameFieldDP(option)
                .fillThepostCodeField()
                .clickOnsumbitButton()
                .getCheckoutHeaderPresence();

        Assertions.assertEquals("Checkout: Overview", checkoutTitle);
    }

    @Epic(value = "Проверки полей")
    @CsvFileSource(resources = "/data/data.csv")
    @Feature(value = "Данные покупателя")
    @Story(value = "Проверки полей страницы заполнения данных юзера")
    @Severity(value = SeverityLevel.NORMAL)
    @Description(value = "Проверка поля POSTCODE на граничные значения и спецсимволы ....")
    @ParameterizedTest(name = "Checking the field 'postcode' with the value {0}")
    public void theFirstDataProviderTest3(String option) throws NoSuchElementException {

        String checkoutTitle = new AutorizationPage()
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .clickOnBackPack()
                .addBackPackToCart()
                .clickBackPackCartIcon()
                .clickCheckoutButton()
                .fillThefirstNameField()
                .fillThelastNameField()
                .fillThepostCodeFieldDP(option)
                .clickOnsumbitButton()
                .getCheckoutHeaderPresence();

        Assertions.assertEquals("Checkout: Overview", checkoutTitle);
    }
}
