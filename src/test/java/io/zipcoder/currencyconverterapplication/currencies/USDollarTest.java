package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import org.junit.Assert;
import org.junit.Test;

public class USDollarTest implements CurrencyTestInterface {
    /**
     * template method to be called by other test methods
     *
     * @param currencyType type of currency to convert to
     * @param expected     rate to expect
     */
    private void testConversion(CurrencyType currencyType, Double expected) {
        // given
        ConvertableCurrency currency = new USDollar();

        // when
        Double actual = currency.convert(currencyType);

        // then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void testUSDollarConversion() {
        testConversion(CurrencyType.US_DOLLAR, 1.0);
    }

    @Test
    public void testAustralianConversion() {
        testConversion(CurrencyType.AUSTRALIAN_DOLLAR, 1.35);
    }

    @Test
    public void testCanadianDollarConversion() {
        testConversion(CurrencyType.CANADIAN_DOLLAR, 1.32);
    }

    @Test
    public void testChineseYRConversion() {
        testConversion(CurrencyType.CHINESE_YR, 6.92);
    }

    @Test
    public void testEuroConversion() {
        testConversion(CurrencyType.EURO, 0.94);
    }

    @Test
    public void testFrancConversion() {
        testConversion(CurrencyType.FRANC, 1.01);
    }

    @Test
    public void testPoundConversion() {
        testConversion(CurrencyType.POUND, 0.82);
    }

    @Test
    public void testRinggitConversion() {
        testConversion(CurrencyType.RINGGIT, 4.47);
    }

    @Test
    public void testRupeeConversion() {
        testConversion(CurrencyType.RUPEE, 68.32);
    }

    @Test
    public void testSingaporeConversion() {
        testConversion(CurrencyType.SINGAPORE_DOLLAR, 0.93);
    }

    @Test
    public void testUniversalCurrencyConversion() {
        testConversion(CurrencyType.UNIVERSAL_CURRENCY, 0.50);
    }

    @Test
    public void testYenConversion() {
        testConversion(CurrencyType.YEN, 115.84);
    }
}