package io.zipcoder.currencyconverter.currencies;

import io.zipcoder.currencyconverter.ConvertableCurrency;
import io.zipcoder.currencyconverter.CurrencyType;
import org.junit.Assert;

public class EuroTest {
    /**
     * template method to be called by other test methods
     * @param currencyType type of currency to convert to
     * @param expected rate to expect
     */
    private void testConversion(CurrencyType currencyType, Double expected) {
        // given
        ConvertableCurrency currency = new Euro();

        // when
        Double actual = currency.convert(currencyType);

        // then
        Assert.assertEquals(expected, actual);
    }


    public void testAustralianConversion() {
        testConversion(CurrencyType.AUSTRALIAN, null);
    }

    public void testCanadianDollarConversion() {
        testConversion(CurrencyType.CANADIAN, null);
    }

    public void testChineseYRConversion() {
        testConversion(CurrencyType.CHINESE_YR, null);
    }

    public void testEuroConversion() {
        testConversion(CurrencyType.EURO, null);
    }

    public void testFrancConversion() {
        testConversion(CurrencyType.FRANC, null);
    }

    public void testPoundConversion() {
        testConversion(CurrencyType.POUND, null);
    }

    public void testRinggitConversion() {
        testConversion(CurrencyType.RINGGIT, null);
    }

    public void testRupeeConversion() {
        testConversion(CurrencyType.RUPEE, null);
    }

    public void testSingaporeConversion() {
        testConversion(CurrencyType.SINGAPORE, null);
    }

    public void testUniversalCurrencyConversion() {
        testConversion(CurrencyType.UNIVERSAL_CURRENCY, null);
    }

    public void testUSDollarConversion() {
        testConversion(CurrencyType.US, null);
    }

    public void testYenConversion() {
        testConversion(CurrencyType.YEN, null);
    }
}
