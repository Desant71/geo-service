package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {
    private LocalizationServiceImpl locService;

    @BeforeEach
    public void init() {
        locService = new LocalizationServiceImpl();
    }

    @Test
    public void testEngLocale() {
        String expectedText = "Welcome";
        String resultText;

        resultText = locService.locale(Country.USA);
        Assertions.assertEquals(expectedText, resultText);

        resultText = locService.locale(Country.BRAZIL);
        Assertions.assertEquals(expectedText, resultText);

        resultText = locService.locale(Country.GERMANY);
        Assertions.assertEquals(expectedText, resultText);
    }

    @Test
    public void testRusLocale() {
        String expectedText = "Добро пожаловать";
        String resultText;

        resultText = locService.locale(Country.RUSSIA);
        Assertions.assertEquals(expectedText, resultText);
    }

}