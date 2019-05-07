package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import org.junit.Assert;
import org.junit.Test;

public class ChineseYRTest {
    /**
     * template method to be called by other test methods
     *
     * @param currencyType type of currency to convert to
     * @param expected     rate to expect
     */
    private void testConversion(CurrencyType currencyType, Double expected) {
        // given
        ConvertableCurrency currency = new ChineseYR();

        // when
        Double actual = currency.convert(currencyType);

        // then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void testChineseYRConversion() {
        testConversion(CurrencyType.CHINESE_YR, 1.0);
    }

    @Test
    public void testAustralianConversion() {
        testConversion(CurrencyType.AUSTRALIAN_DOLLAR, .19508670520231217);
    }

    @Test
    public void testCanadianDollarConversion() {
        testConversion(CurrencyType.CANADIAN_DOLLAR, .19075144508670522);
    }

    @Test
    public void testEuroConversion() {
        testConversion(CurrencyType.EURO, .13583815028901736);
    }

    @Test
    public void testFrancConversion() {
        testConversion(CurrencyType.FRANC, .14595375722543355);
    }

    @Test
    public void testPoundConversion() {
        testConversion(CurrencyType.POUND, .11849710982658959);
    }

    @Test
    public void testRinggitConversion() {
        testConversion(CurrencyType.RINGGIT, .6459537572254336);
    }

    @Test
    public void testRupeeConversion() {
        testConversion(CurrencyType.RUPEE, 9.872832369942197);
    }

    @Test
    public void testSingaporeConversion() {
        testConversion(CurrencyType.SINGAPORE_DOLLAR, .13439306358381506);
    }

    @Test
    public void testUniversalCurrencyConversion() {
        testConversion(CurrencyType.UNIVERSAL_CURRENCY, .07225433526011561);
    }

    @Test
    public void testUSDollarConversion() {
        testConversion(CurrencyType.US_DOLLAR, .14450867052023122);
    }

    @Test
    public void testYenConversion() {
        testConversion(CurrencyType.YEN, 16.739884393063587);
    }
}
