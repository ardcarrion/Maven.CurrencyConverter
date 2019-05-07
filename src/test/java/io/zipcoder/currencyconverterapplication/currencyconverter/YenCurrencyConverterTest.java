package io.zipcoder.currencyconverterapplication.currencyconverter;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyConverter;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import io.zipcoder.currencyconverterapplication.currencies.Yen;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leonhunter
 */
public class YenCurrencyConverterTest {
    /**
     * template method to be called by other test methods
     * @param amountOfBaseCurrency - amount of the base currency to be converted
     * @param targetCurrency - enumeration of the target currency type
     * @param expected - expected amount in target current
     */
    private void testConversion(Double amountOfBaseCurrency, CurrencyType targetCurrency, Double expected) {
        // given
        ConvertableCurrency sourceCurrency = new Yen();

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
    public void testYenConversion() {
        testConversion(CurrencyType.YEN, 10.0);
    }

    @Test
    public void testAustralianConversion() {
        testConversion(CurrencyType.AUSTRALIAN_DOLLAR, .1165400552486188);
    }

    @Test
    public void testCanadianDollarConversion() {
        testConversion(CurrencyType.CANADIAN_DOLLAR, .11395027624309393);
    }

    @Test
    public void testChineseYRConversion() {
        testConversion(CurrencyType.CHINESE_YR, .5973756906077348);
    }

    @Test
    public void testEuroConversion() {
        testConversion(CurrencyType.EURO, .081146408839779);
    }

    @Test
    public void testFrancConversion() {
        testConversion(CurrencyType.FRANC, .08718922651933702);
    }

    @Test
    public void testPoundConversion() {
        testConversion(CurrencyType.POUND, .07078729281767956);
    }

    @Test
    public void testRinggitConversion() {
        testConversion(CurrencyType.RINGGIT, .3858770718232044);
    }

    @Test
    public void testRupeeConversion() {
        testConversion(CurrencyType.RUPEE, 5.897790055248618);
    }

    @Test
    public void testSingaporeConversion() {
        testConversion(CurrencyType.SINGAPORE_DOLLAR, .08028314917127072);
    }

    @Test
    public void testUniversalCurrencyConversion() {
        testConversion(CurrencyType.UNIVERSAL_CURRENCY, .04316298342541437);
    }

    @Test
    public void testUSDollarConversion() {
        testConversion(CurrencyType.US_DOLLAR, .08632596685082873);
    }
}
