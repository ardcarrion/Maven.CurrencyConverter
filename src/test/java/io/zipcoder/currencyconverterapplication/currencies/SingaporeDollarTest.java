package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import org.junit.Assert;
import org.junit.Test;

public class SingaporeDollarTest {
    /**
     * template method to be called by other test methods
     * @param currencyType type of currency to convert to
     * @param expected rate to expect
     */
    private void testConversion(CurrencyType currencyType, Double expected) {
        // given
        ConvertableCurrency currency = new SingaporeDollar();

        // when
        Double actual = currency.convert(currencyType);

        // then
        Assert.assertEquals(expected, actual, .0001);
    }
    @Test
    public void testSingaporeConversion() {
        testConversion(CurrencyType.SINGAPORE_DOLLAR, 1.0);
    }

    @Test
    public void testAustralianConversion() {
        testConversion(CurrencyType.AUSTRALIAN_DOLLAR, 1.4516129032258065);
    }

    @Test
    public void testCanadianDollarConversion() {
        testConversion(CurrencyType.CANADIAN_DOLLAR, 1.4193548387096775);
    }

    @Test
    public void testChineseYRConversion() {
        testConversion(CurrencyType.CHINESE_YR, 7.440860215053763);
    }

    @Test
    public void testEuroConversion() {
        testConversion(CurrencyType.EURO, 1.010752688172043);
    }

    @Test
    public void testFrancConversion() {
        testConversion(CurrencyType.FRANC, 1.086021505376344);
    }

    @Test
    public void testPoundConversion() {
        testConversion(CurrencyType.POUND, .8817204301075268);
    }

    @Test
    public void testRinggitConversion() {
        testConversion(CurrencyType.RINGGIT, 4.806451612903225);
    }

    @Test
    public void testRupeeConversion() {
        testConversion(CurrencyType.RUPEE, 73.46236559139784);
    }

    @Test
    public void testUniversalCurrencyConversion() {
        testConversion(CurrencyType.UNIVERSAL_CURRENCY, .5376344086021505);
    }

    @Test
    public void testUSDollarConversion() {
        testConversion(CurrencyType.US_DOLLAR, 1.075268817204301);
    }

    @Test
    public void testYenConversion() {
        testConversion(CurrencyType.YEN, 124.55913978494623);
    }
}
