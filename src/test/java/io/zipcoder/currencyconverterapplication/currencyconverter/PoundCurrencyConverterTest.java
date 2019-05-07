package io.zipcoder.currencyconverterapplication.currencyconverter;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyConverter;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import io.zipcoder.currencyconverterapplication.currencies.Pound;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leonhunter
 */
public class PoundCurrencyConverterTest {
    /**
     * template method to be called by other test methods
     * @param amountOfBaseCurrency - amount of the base currency to be converted
     * @param targetCurrency - enumeration of the target currency type
     * @param expected - expected amount in target current
     */
    private void testConversion(Double amountOfBaseCurrency, CurrencyType targetCurrency, Double expected) {
        // given
        ConvertableCurrency sourceCurrency = new Pound();

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
    public void testPoundConversion() {
        testConversion(CurrencyType.POUND, 10.0);
    }

    @Test
    public void testAustralianConversion() {
        testConversion(CurrencyType.AUSTRALIAN_DOLLAR, 16.463414634146343);
    }

    @Test
    public void testCanadianDollarConversion() {
        testConversion(CurrencyType.CANADIAN_DOLLAR, 16.097560975609757);
    }

    @Test
    public void testChineseYRConversion() {
        testConversion(CurrencyType.CHINESE_YR, 84.39024390243903);
    }

    @Test
    public void testEuroConversion() {
        testConversion(CurrencyType.EURO, 11.46341463414634);
    }

    @Test
    public void testFrancConversion() {
        testConversion(CurrencyType.FRANC, 12.317073170731707);
    }

    @Test
    public void testRinggitConversion() {
        testConversion(CurrencyType.RINGGIT, 54.51219512195122);
    }

    @Test
    public void testRupeeConversion() {
        testConversion(CurrencyType.RUPEE, 833.170731707317);
    }

    @Test
    public void testSingaporeConversion() {
        testConversion(CurrencyType.SINGAPORE_DOLLAR, 11.341463414634148);
    }

    @Test
    public void testUniversalCurrencyConversion() {
        testConversion(CurrencyType.UNIVERSAL_CURRENCY, 6.097560975609756);
    }

    @Test
    public void testUSDollarConversion() {
        testConversion(CurrencyType.US_DOLLAR, 12.195121951219512);
    }

    @Test
    public void testYenConversion() {
        testConversion(CurrencyType.YEN, 1412.6829268292684);
    }
}
