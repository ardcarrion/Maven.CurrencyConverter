package io.zipcoder.currencyconverterapplication.currencyconverter;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyConverter;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import io.zipcoder.currencyconverterapplication.currencies.Ringgit;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leonhunter
 */
public class RinggitCurrencyConverterTest {
    /**
     * template method to be called by other test methods
     * @param amountOfBaseCurrency - amount of the base currency to be converted
     * @param targetCurrency - enumeration of the target currency type
     * @param expected - expected amount in target current
     */
    private void testConversion(Double amountOfBaseCurrency, CurrencyType targetCurrency, Double expected) {
        // given
        ConvertableCurrency sourceCurrency = new Ringgit();

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
    public void testRinggitConversion() {
        testConversion(CurrencyType.RINGGIT, 10.0);
    }

    @Test
    public void testAustralianConversion() {
        testConversion(CurrencyType.AUSTRALIAN_DOLLAR, 3.02013422818792);
    }

    @Test
    public void testCanadianDollarConversion() {
        testConversion(CurrencyType.CANADIAN_DOLLAR, 2.953020134228188);
    }

    @Test
    public void testChineseYRConversion() {
        testConversion(CurrencyType.CHINESE_YR, 15.480984340044743);
    }

    @Test
    public void testEuroConversion() {
        testConversion(CurrencyType.EURO, 2.1029082774049218);
    }

    @Test
    public void testFrancConversion() {
        testConversion(CurrencyType.FRANC, 2.259507829977629);
    }

    @Test
    public void testPoundConversion() {
        testConversion(CurrencyType.POUND, 1.8344519015659955);
    }

    @Test
    public void testRupeeConversion() {
        testConversion(CurrencyType.RUPEE, 152.84116331096197);
    }

    @Test
    public void testSingaporeConversion() {
        testConversion(CurrencyType.SINGAPORE_DOLLAR, 2.0805369127516782);
    }

    @Test
    public void testUniversalCurrencyConversion() {
        testConversion(CurrencyType.UNIVERSAL_CURRENCY, 1.1185682326621925);
    }

    @Test
    public void testUSDollarConversion() {
        testConversion(CurrencyType.US_DOLLAR, 2.237136465324385);
    }

    @Test
    public void testYenConversion() {
        testConversion(CurrencyType.YEN, 259.14988814317677);
    }
}
