package io.zipcoder.currencyconverterapplication.currencyconverter;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyConverter;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import io.zipcoder.currencyconverterapplication.currencies.USDollar;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leonhunter
 */
public class USDollarTest {
    /**
     * template method to be called by other test methods
     * @param amountOfBaseCurrency - amount of the base currency to be converted
     * @param targetCurrency - enumeration of the target currency type
     * @param expected - expected amount in target current
     */
    private void testConversion(Double amountOfBaseCurrency, CurrencyType targetCurrency, Double expected) {
        // given
        ConvertableCurrency sourceCurrency = new USDollar();

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
    public void testUSDollarConversion() {
        testConversion(CurrencyType.US_DOLLAR, 10.0);
    }

    @Test
    public void testAustralianConversion() {
        testConversion(CurrencyType.AUSTRALIAN_DOLLAR, 13.5);
    }

    @Test
    public void testCanadianDollarConversion() {
        testConversion(CurrencyType.CANADIAN_DOLLAR, 13.2);
    }

    @Test
    public void testChineseYRConversion() {
        testConversion(CurrencyType.CHINESE_YR, 69.2);
    }

    @Test
    public void testEuroConversion() {
        testConversion(CurrencyType.EURO, 9.4);
    }

    @Test
    public void testFrancConversion() {
        testConversion(CurrencyType.FRANC, 10.1);
    }

    @Test
    public void testPoundConversion() {
        testConversion(CurrencyType.POUND, 8.2);
    }

    @Test
    public void testRinggitConversion() {
        testConversion(CurrencyType.RINGGIT, 44.7);
    }

    @Test
    public void testRupeeConversion() {
        testConversion(CurrencyType.RUPEE, 683.2);
    }

    @Test
    public void testSingaporeConversion() {
        testConversion(CurrencyType.SINGAPORE_DOLLAR, 9.3);
    }

    @Test
    public void testUniversalCurrencyConversion() {
        testConversion(CurrencyType.UNIVERSAL_CURRENCY, 5.0);
    }

    @Test
    public void testYenConversion() {
        testConversion(CurrencyType.YEN, 1158.4);
    }
}
