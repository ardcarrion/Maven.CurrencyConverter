package io.zipcoder.currencyconverter.currencies;

import io.zipcoder.currencyconverter.ConvertableCurrency;
import io.zipcoder.currencyconverter.CurrencyType;
import org.junit.Assert;
import org.junit.Test;

public class USDollarTest implements CurrencyTestInterface {
    /**
     * template method to be called by other test methods
     * @param currencyType type of currency to convert to
     * @param expected rate to expect
     */
    private void testConversion(CurrencyType currencyType, Double expected) {
        // given
        ConvertableCurrency currency = new USDollar();

        // when
        Double actual = currency.convert(currencyType);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testAustralianConversion() {
        testConversion(CurrencyType.AUSTRALIAN, 2.70);
    }

    @Test
    public void testCanadianDollarConversion() {
        testConversion(CurrencyType.CANADIAN, 2.64);
    }

    @Test
    public void testChineseYRConversion() {
        testConversion(CurrencyType.CHINESE_YR, 13.84);
    }

    @Test
    public void testEuroConversion() {
        testConversion(CurrencyType.EURO, 1.88);
    }

    @Test
    public void testFrancConversion() {
        testConversion(CurrencyType.FRANC, 2.02);
    }

    @Test
    public void testPoundConversion() {
        testConversion(CurrencyType.POUND, 1.64);
    }

    @Test
    public void testRinggitConversion() {
        testConversion(CurrencyType.RINGGIT, 8.94);
    }

    @Test
    public void testRupeeConversion() {
        testConversion(CurrencyType.RUPEE, 136.64);
    }

    @Test
    public void testSingaporeConversion() {
        testConversion(CurrencyType.SINGAPORE, 1.86);
    }

    @Test
    public void testUniversalCurrencyConversion() {
        testConversion(CurrencyType.UNIVERSAL_CURRENCY, 1.0);
    }

    @Test
    public void testUSDollarConversion() {
        testConversion(CurrencyType.US, 2.0);
    }

    @Test
    public void testYenConversion() {
        testConversion(CurrencyType.YEN, 231.68);
    }
}