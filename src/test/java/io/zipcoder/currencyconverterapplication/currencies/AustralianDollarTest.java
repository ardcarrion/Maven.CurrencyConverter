package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import org.junit.Assert;
import org.junit.Test;

public class AustralianDollarTest implements CurrencyTestInterface {
    /**
     * template method to be called by other test methods
     * @param currencyType type of currency to convert to
     * @param expected rate to expect
     */
    private void testConversion(CurrencyType currencyType, Double expected) {
        // given
        ConvertableCurrency currency = new AustralianDollar();

        // when
        Double actual = currency.convert(currencyType);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testAustralianConversion() {
        testConversion(CurrencyType.AUSTRALIAN_DOLLAR, 1.0);
    }

    @Test
    public void testCanadianDollarConversion() {
        testConversion(CurrencyType.CANADIAN_DOLLAR, .9777777777777777);
    }

    @Test
    public void testChineseYRConversion() {
        testConversion(CurrencyType.CHINESE_YR, 5.125925925925926);
    }

    @Test
    public void testEuroConversion() {
        testConversion(CurrencyType.EURO, .6962962962962962);
    }

    @Test
    public void testFrancConversion() {
        testConversion(CurrencyType.FRANC, .7481481481481481);
    }

    @Test
    public void testPoundConversion() {
        testConversion(CurrencyType.POUND, .6074074074074073);
    }

    @Test
    public void testRinggitConversion() {
        testConversion(CurrencyType.RINGGIT, 3.311111111111111);
    }

    @Test
    public void testRupeeConversion() {
        testConversion(CurrencyType.RUPEE, 50.6074074074074);
    }

    @Test
    public void testSingaporeConversion() {
        testConversion(CurrencyType.SINGAPORE_DOLLAR, .6888888888888889);
    }

    @Test
    public void testUniversalCurrencyConversion() {
        testConversion(CurrencyType.UNIVERSAL_CURRENCY, .37037037037037035);
    }

    @Test
    public void testUSDollarConversion() {
        testConversion(CurrencyType.US_DOLLAR, .7407407407407407);
    }

    @Test
    public void testYenConversion() {
        testConversion(CurrencyType.YEN, 85.80740740740741);
    }
}
