package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import org.junit.Assert;
import org.junit.Test;

public class YenTest {
    /**
     * template method to be called by other test methods
     * @param currencyType type of currency to convert to
     * @param expected rate to expect
     */
    private void testConversion(CurrencyType currencyType, Double expected) {
        // given
        ConvertableCurrency currency = new Yen();

        // when
        Double actual = currency.convert(currencyType);

        // then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void testYenConversion() {
        testConversion(CurrencyType.YEN, 1.0);
    }

    @Test
    public void testAustralianConversion() {
        testConversion(CurrencyType.AUSTRALIAN_DOLLAR, .01165400552486188);
    }

    @Test
    public void testCanadianDollarConversion() {
        testConversion(CurrencyType.CANADIAN_DOLLAR, .011395027624309393);
    }

    @Test
    public void testChineseYRConversion() {
        testConversion(CurrencyType.CHINESE_YR, .05973756906077348);
    }

    @Test
    public void testEuroConversion() {
        testConversion(CurrencyType.EURO, .0081146408839779);
    }

    @Test
    public void testFrancConversion() {
        testConversion(CurrencyType.FRANC, .008718922651933702);
    }

    @Test
    public void testPoundConversion() {
        testConversion(CurrencyType.POUND, .007078729281767956);
    }

    @Test
    public void testRinggitConversion() {
        testConversion(CurrencyType.RINGGIT, .03858770718232044);
    }

    @Test
    public void testRupeeConversion() {
        testConversion(CurrencyType.RUPEE, .5897790055248618);
    }

    @Test
    public void testSingaporeConversion() {
        testConversion(CurrencyType.SINGAPORE_DOLLAR, .008028314917127072);
    }

    @Test
    public void testUniversalCurrencyConversion() {
        testConversion(CurrencyType.UNIVERSAL_CURRENCY, .004316298342541437);
    }

    @Test
    public void testUSDollarConversion() {
        testConversion(CurrencyType.US_DOLLAR, .008632596685082873);
    }
}
