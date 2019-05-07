package io.zipcoder.currencyconverterapplication.currencyconverter;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyConverter;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import io.zipcoder.currencyconverterapplication.currencies.Rupee;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leonhunter
 */
public class RupeeCurrencyConverterTest {
    /**
     * template method to be called by other test methods
     * @param amountOfBaseCurrency - amount of the base currency to be converted
     * @param targetCurrency - enumeration of the target currency type
     * @param expected - expected amount in target current
     */
    private void testConversion(Double amountOfBaseCurrency, CurrencyType targetCurrency, Double expected) {
        // given
        ConvertableCurrency sourceCurrency = new Rupee();

        // when
        Double actual = CurrencyConverter.convert(amountOfBaseCurrency, sourceCurrency, targetCurrency);

        // then
        Assert.assertEquals(expected, actual, .0001);
    }

    /**
     * template method to be called by other test methods
     * @param targetCurrency type of currency to convert to
     * @param expected rate to expect
     */
    private void testConversion(CurrencyType targetCurrency, Double expected) {
        testConversion(10.0, targetCurrency, expected);
    }

    @Test
    public void testRupeeConversion() {
        testConversion(CurrencyType.RUPEE, 10.0);
    }

    @Test
    public void testAustralianConversion() {
        testConversion(CurrencyType.AUSTRALIAN_DOLLAR, 0.19759953161592507);
    }

    @Test
    public void testCanadianDollarConversion() {
        testConversion(CurrencyType.CANADIAN_DOLLAR, 0.19320843091334895);
    }

    @Test
    public void testChineseYRConversion() {
        testConversion(CurrencyType.CHINESE_YR, 1.01288056206089);
    }

    @Test
    public void testEuroConversion() {
        testConversion(CurrencyType.EURO, .13758782201405152);
    }

    @Test
    public void testFrancConversion() {
        testConversion(CurrencyType.FRANC, .1478337236533958);
    }

    @Test
    public void testPoundConversion() {
        testConversion(CurrencyType.POUND, .12002341920374707);
    }

    @Test
    public void testRinggitConversion() {
        testConversion(CurrencyType.RINGGIT, .6542740046838408);
    }

    @Test
    public void testSingaporeConversion() {
        testConversion(CurrencyType.SINGAPORE_DOLLAR, .1361241217798595);
    }

    @Test
    public void testUniversalCurrencyConversion() {
        testConversion(CurrencyType.UNIVERSAL_CURRENCY, .07318501170960188);
    }

    @Test
    public void testUSDollarConversion() {
        testConversion(CurrencyType.US_DOLLAR, .14637002341920375);
    }

    @Test
    public void testYenConversion() {
        testConversion(CurrencyType.YEN, 16.955503512880563);
    }
}
