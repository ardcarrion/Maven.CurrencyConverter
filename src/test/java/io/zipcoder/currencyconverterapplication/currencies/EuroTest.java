package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import org.junit.Assert;
import org.junit.Test;

public class EuroTest {
    /**
     * template method to be called by other test methods
     *
     * @param currencyType type of currency to convert to
     * @param expected     rate to expect
     */
    private void testConversion(CurrencyType currencyType, Double expected) {
        // given
        ConvertableCurrency currency = new Euro();

        // when
        Double actual = currency.convert(currencyType);

        // then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void testEuroConversion() {
        testConversion(CurrencyType.EURO, 1.0);
    }

    @Test
    public void testAustralianConversion() {
        testConversion(CurrencyType.AUSTRALIAN_DOLLAR, 1.4361702127659575);
    }

    @Test
    public void testCanadianDollarConversion() {
        testConversion(CurrencyType.CANADIAN_DOLLAR, 1.4042553191489362);
    }

    @Test
    public void testChineseYRConversion() {
        testConversion(CurrencyType.CHINESE_YR, 7.361702127659575);
    }

    @Test
    public void testFrancConversion() {
        testConversion(CurrencyType.FRANC, 1.074468085106383);
    }

    @Test
    public void testPoundConversion() {
        testConversion(CurrencyType.POUND, .8723404255319148);
    }

    @Test
    public void testRinggitConversion() {
        testConversion(CurrencyType.RINGGIT, 4.75531914893617);
    }

    @Test
    public void testRupeeConversion() {
        testConversion(CurrencyType.RUPEE, 72.68085106382978);
    }

    @Test
    public void testSingaporeConversion() {
        testConversion(CurrencyType.SINGAPORE_DOLLAR, .9893617021276596);
    }

    @Test
    public void testUniversalCurrencyConversion() {
        testConversion(CurrencyType.UNIVERSAL_CURRENCY, .5319148936170213);
    }

    @Test
    public void testUSDollarConversion() {
        testConversion(CurrencyType.US_DOLLAR, 1.0638297872340425);
    }

    @Test
    public void testYenConversion() {
        testConversion(CurrencyType.YEN, 123.23404255319149);
    }
}
