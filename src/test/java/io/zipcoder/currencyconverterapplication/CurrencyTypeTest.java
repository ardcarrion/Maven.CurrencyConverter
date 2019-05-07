package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon
 */
public class CurrencyTypeTest {
    /**
     * template method to be called by other test methods
     * @param expectedType type of currency type to expect
     * @param currencyObject type of object to check type of
     */
    private void test(CurrencyType expectedType, ConvertableCurrency currencyObject) {
        // when
        CurrencyType actualType = CurrencyType.getTypeOfCurrency(currencyObject);

        // then
        Assert.assertEquals(expectedType, actualType);
    }

    @Test
    public void testGetTypeOfCurrencyOfAustralianDollar() {
        test(CurrencyType.AUSTRALIAN_DOLLAR, new AustralianDollar());
    }

    @Test
    public void testGetTypeOfCurrencyOfCanadianDollar() {
        test(CurrencyType.CANADIAN_DOLLAR, new CanadianDollar());
    }

    @Test
    public void testGetTypeOfCurrencyOfChineseYR() {
        test(CurrencyType.CHINESE_YR, new ChineseYR());
    }

    @Test
    public void testGetTypeOfCurrencyOfEuro() {
        test(CurrencyType.EURO, new Euro());
    }

    @Test
    public void testGetTypeOfCurrencyOfFranc() {
        test(CurrencyType.FRANC, new Franc());
    }

    @Test
    public void testGetTypeOfCurrencyOfPound() {
        test(CurrencyType.POUND, new Pound());
    }

    @Test
    public void testGetTypeOfCurrencyOfRinggit() {
        test(CurrencyType.RINGGIT, new Ringgit());
    }

    @Test
    public void testGetTypeOfCurrencyOfRupee() {
        test(CurrencyType.RUPEE, new Rupee());
    }

    @Test
    public void testGetTypeOfCurrencyOfSingaporeDollar() {
        test(CurrencyType.SINGAPORE_DOLLAR, new SingaporeDollar());
    }

    @Test
    public void testGetTypeOfCurrencyOfUniversalCurrency() {
        test(CurrencyType.UNIVERSAL_CURRENCY, new UniversalCurrency());
    }

    @Test
    public void testGetTypeOfCurrencyOfUSDollar() {
        test(CurrencyType.US_DOLLAR, new USDollar());
    }

    @Test
    public void testGetTypeOfCurrencyOfYen() {
        test(CurrencyType.YEN, new Yen());
    }
}
