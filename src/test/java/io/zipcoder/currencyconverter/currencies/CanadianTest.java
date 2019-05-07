package io.zipcoder.currencyconverter.currencies;

import io.zipcoder.currencyconverter.ConvertableCurrency;
import io.zipcoder.currencyconverter.CurrencyType;
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
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCanadianDollarConversion() {
        testConversion(CurrencyType.CANADIAN_DOLLAR, 1.0);
    }

    @Test
    public void testAustralianConversion() {
        testConversion(CurrencyType.AUSTRALIAN_DOLLAR, null);
    }

    @Test
    public void testChineseYRConversion() {
        testConversion(CurrencyType.CHINESE_YR, null);
    }

    @Test
    public void testEuroConversion() {
        testConversion(CurrencyType.EURO, null);
    }

    @Test
    public void testFrancConversion() {
        testConversion(CurrencyType.FRANC, null);
    }

    @Test
    public void testPoundConversion() {
        testConversion(CurrencyType.POUND, null);
    }

    @Test
    public void testRinggitConversion() {
        testConversion(CurrencyType.RINGGIT, null);
    }

    @Test
    public void testRupeeConversion() {
        testConversion(CurrencyType.RUPEE, null);
    }

    @Test
    public void testSingaporeConversion() {
        testConversion(CurrencyType.SINGAPORE_DOLLAR, null);
    }

    @Test
    public void testUniversalCurrencyConversion() {
        testConversion(CurrencyType.UNIVERSAL_CURRENCY, null);
    }

    @Test
    public void testUSDollarConversion() {
        testConversion(CurrencyType.US_DOLLAR, null);
    }

    @Test
    public void testYenConversion() {
        testConversion(CurrencyType.YEN, null);
    }
}
