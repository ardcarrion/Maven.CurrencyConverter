package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import org.junit.Assert;
import org.junit.Test;

public class RinggitTest {
    /**
     * template method to be called by other test methods
     *
     * @param currencyType type of currency to convert to
     * @param expected     rate to expect
     */
    private void testConversion(CurrencyType currencyType, Double expected) {
        // given
        ConvertableCurrency currency = new Ringgit();

        // when
        Double actual = currency.convert(currencyType);

        // then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void testRinggitConversion() {
        testConversion(CurrencyType.RINGGIT, 1.0);
    }

    @Test
    public void testAustralianConversion() {
        testConversion(CurrencyType.AUSTRALIAN_DOLLAR, .302013422818792);
    }

    @Test
    public void testCanadianDollarConversion() {
        testConversion(CurrencyType.CANADIAN_DOLLAR, .2953020134228188);
    }

    @Test
    public void testChineseYRConversion() {
        testConversion(CurrencyType.CHINESE_YR, 1.5480984340044743);
    }

    @Test
    public void testEuroConversion() {
        testConversion(CurrencyType.EURO, .21029082774049218);
    }

    @Test
    public void testFrancConversion() {
        testConversion(CurrencyType.FRANC, .2259507829977629);
    }

    @Test
    public void testPoundConversion() {
        testConversion(CurrencyType.POUND, .18344519015659955);
    }

    @Test
    public void testRupeeConversion() {
        testConversion(CurrencyType.RUPEE, 15.284116331096197);
    }

    @Test
    public void testSingaporeConversion() {
        testConversion(CurrencyType.SINGAPORE_DOLLAR, 0.20805369127516782);
    }

    @Test
    public void testUniversalCurrencyConversion() {
        testConversion(CurrencyType.UNIVERSAL_CURRENCY, .11185682326621925);
    }

    @Test
    public void testUSDollarConversion() {
        testConversion(CurrencyType.US_DOLLAR, .2237136465324385);
    }

    @Test
    public void testYenConversion() {
        testConversion(CurrencyType.YEN, 25.914988814317677);
    }
}
