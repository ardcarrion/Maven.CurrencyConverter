package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {

    @Override
    public CurrencyType getBaseCurrency() {
        return CurrencyType.AUSTRALIAN_DOLLAR;
    }
}
