package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import org.junit.Assert;
import org.junit.Test;

public class RupeeTest {
    /**
     * template method to be called by other test methods
     *
     * @param currencyType type of currency to convert to
     * @param expected     rate to expect
     */
    private void testConversion(CurrencyType currencyType, Double expected) {
        // given
        ConvertableCurrency currency = new Rupee();

        // when
        Double actual = currency.convert(currencyType);

        // then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void testRupeeConversion() {
        testConversion(CurrencyType.RUPEE, 1.0);
    }

    @Test
    public void testAustralianConversion() {
        testConversion(CurrencyType.AUSTRALIAN_DOLLAR, .019759953161592507);
    }

    @Test
    public void testCanadianDollarConversion() {
        testConversion(CurrencyType.CANADIAN_DOLLAR, .019320843091334895);
    }

    @Test
    public void testChineseYRConversion() {
        testConversion(CurrencyType.CHINESE_YR, .101288056206089);
    }

    @Test
    public void testEuroConversion() {
        testConversion(CurrencyType.EURO, .013758782201405152);
    }

    @Test
    public void testFrancConversion() {
        testConversion(CurrencyType.FRANC, .01478337236533958);
    }

    @Test
    public void testPoundConversion() {
        testConversion(CurrencyType.POUND, .012002341920374707);
    }

    @Test
    public void testRinggitConversion() {
        testConversion(CurrencyType.RINGGIT, .06542740046838408);
    }

    @Test
    public void testSingaporeConversion() {
        testConversion(CurrencyType.SINGAPORE_DOLLAR, .01361241217798595);
    }

    @Test
    public void testUniversalCurrencyConversion() {
        testConversion(CurrencyType.UNIVERSAL_CURRENCY, .007318501170960188);
    }

    @Test
    public void testUSDollarConversion() {
        testConversion(CurrencyType.US_DOLLAR, .014637002341920375);
    }

    @Test
    public void testYenConversion() {
        testConversion(CurrencyType.YEN, 1.6955503512880563);
    }
}
