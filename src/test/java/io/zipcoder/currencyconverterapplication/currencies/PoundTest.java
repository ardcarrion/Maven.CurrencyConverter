package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import org.junit.Assert;
import org.junit.Test;

public class PoundTest {
    /**
     * template method to be called by other test methods
     *
     * @param currencyType type of currency to convert to
     * @param expected     rate to expect
     */
    private void testConversion(CurrencyType currencyType, Double expected) {
        // given
        ConvertableCurrency currency = new Pound();

        // when
        Double actual = currency.convert(currencyType);

        // then
        Assert.assertEquals(expected, actual, .0001);
    }

    @Test
    public void testPoundConversion() {
        testConversion(CurrencyType.POUND, 1.0);
    }

    @Test
    public void testAustralianConversion() {
        testConversion(CurrencyType.AUSTRALIAN_DOLLAR, 1.6463414634146343);
    }

    @Test
    public void testCanadianDollarConversion() {
        testConversion(CurrencyType.CANADIAN_DOLLAR, 1.6097560975609757);
    }

    @Test
    public void testChineseYRConversion() {
        testConversion(CurrencyType.CHINESE_YR, 8.439024390243903);
    }

    @Test
    public void testEuroConversion() {
        testConversion(CurrencyType.EURO, 1.146341463414634);
    }

    @Test
    public void testFrancConversion() {
        testConversion(CurrencyType.FRANC, 1.2317073170731707);
    }

    @Test
    public void testRinggitConversion() {
        testConversion(CurrencyType.RINGGIT, 5.451219512195122);
    }

    @Test
    public void testRupeeConversion() {
        testConversion(CurrencyType.RUPEE, 83.3170731707317);
    }

    @Test
    public void testSingaporeConversion() {
        testConversion(CurrencyType.SINGAPORE_DOLLAR, 1.1341463414634148);
    }

    @Test
    public void testUniversalCurrencyConversion() {
        testConversion(CurrencyType.UNIVERSAL_CURRENCY, .6097560975609756);
    }

    @Test
    public void testUSDollarConversion() {
        testConversion(CurrencyType.US_DOLLAR, 1.2195121951219512);
    }

    @Test
    public void testYenConversion() {
        testConversion(CurrencyType.YEN, 141.26829268292684);
    }
}
