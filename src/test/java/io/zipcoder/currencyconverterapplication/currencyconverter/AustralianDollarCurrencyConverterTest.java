package io.zipcoder.currencyconverterapplication.currencyconverter;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyConverter;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import io.zipcoder.currencyconverterapplication.currencies.AustralianDollar;
import io.zipcoder.currencyconverterapplication.currencies.CurrencyTestInterface;
import org.junit.Assert;
import org.junit.Test;

public class AustralianDollarCurrencyConverterTest implements CurrencyTestInterface {
    /**
     * template method to be called by other test methods
     * @param amountOfBaseCurrency - amount of the base currency to be converted
     * @param targetCurrency - enumeration of the target currency type
     * @param expected - expected amount in target current
     */
    private void testConversion(Double amountOfBaseCurrency, CurrencyType targetCurrency, Double expected) {
        // given
        ConvertableCurrency sourceCurrency = new AustralianDollar();

        // when
        Double actual = CurrencyConverter.convert(amountOfBaseCurrency, sourceCurrency, targetCurrency);

        // then
        Assert.assertEquals(expected, actual, .0001);
    }

    /**
     * template method to be called by other test methods
     * @param targetCurrency type of currency to convert to
     * @param expected rate to expect
     */
    private void testConversion(CurrencyType targetCurrency, Double expected) {
        testConversion(10.0, targetCurrency, expected);
    }


    @Test
    public void testAustralianConversion() {
        testConversion(CurrencyType.AUSTRALIAN_DOLLAR, 10.0);
    }

    @Test
    public void testCanadianDollarConversion() {
        testConversion(CurrencyType.CANADIAN_DOLLAR, 9.777777777777777);
    }

    @Test
    public void testChineseYRConversion() {
        testConversion(CurrencyType.CHINESE_YR, 51.25925925925926);
    }

    @Test
    public void testEuroConversion() {
        testConversion(CurrencyType.EURO, 6.962962962962962);
    }

    @Test
    public void testFrancConversion() {
        testConversion(CurrencyType.FRANC, 7.481481481481481);
    }

    @Test
    public void testPoundConversion() {
        testConversion(CurrencyType.POUND, 6.074074074074073);
    }

    @Test
    public void testRinggitConversion() {
        testConversion(CurrencyType.RINGGIT, 33.11111111111111);
    }

    @Test
    public void testRupeeConversion() {
        testConversion(CurrencyType.RUPEE, 506.074074074074);
    }

    @Test
    public void testSingaporeConversion() {
        testConversion(CurrencyType.SINGAPORE_DOLLAR, 6.888888888888889);
    }

    @Test
    public void testUniversalCurrencyConversion() {
        testConversion(CurrencyType.UNIVERSAL_CURRENCY, 3.7037037037037035);
    }

    @Test
    public void testUSDollarConversion() {
        testConversion(CurrencyType.US_DOLLAR, 7.407407407407407);
    }

    @Test
    public void testYenConversion() {
        testConversion(CurrencyType.YEN, 858.0740740740741);
    }
}
