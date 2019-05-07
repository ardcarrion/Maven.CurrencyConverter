package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import org.junit.Assert;
import org.junit.Test;

public class CanadianTest {
    /**
     * template method to be called by other test methods
     *
     * @param currencyType type of currency to convert to
     * @param expected     rate to expect
     */
    private void testConversion(CurrencyType currencyType, Double expected) {
        // given
        ConvertableCurrency currency = new CanadianDollar();

        // when
        Double actual = currency.convert(currencyType);

        // then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void testCanadianDollarConversion() {
        testConversion(CurrencyType.CANADIAN_DOLLAR, 1.0);
    }

    @Test
    public void testAustralianConversion() {
        testConversion(CurrencyType.AUSTRALIAN_DOLLAR, 1.0227272727272727);
    }

    @Test
    public void testChineseYRConversion() {
        testConversion(CurrencyType.CHINESE_YR, 5.242424242424242);
    }

    @Test
    public void testEuroConversion() {
        testConversion(CurrencyType.EURO, .712121212121212);
    }

    @Test
    public void testFrancConversion() {
        testConversion(CurrencyType.FRANC, .7651515151515151);
    }

    @Test
    public void testPoundConversion() {
        testConversion(CurrencyType.POUND, .6212121212121212);
    }

    @Test
    public void testRinggitConversion() {
        testConversion(CurrencyType.RINGGIT, 3.3863636363636362);
    }

    @Test
    public void testRupeeConversion() {
        testConversion(CurrencyType.RUPEE, 51.75757575757575);
    }

    @Test
    public void testSingaporeConversion() {
        testConversion(CurrencyType.SINGAPORE_DOLLAR, .7045454545454546);
    }

    @Test
    public void testUniversalCurrencyConversion() {
        testConversion(CurrencyType.UNIVERSAL_CURRENCY, .3787878787878788);
    }

    @Test
    public void testUSDollarConversion() {
        testConversion(CurrencyType.US_DOLLAR, .7575757575757576);
    }

    @Test
    public void testYenConversion() {
        testConversion(CurrencyType.YEN, 87.75757575757576);
    }
}
