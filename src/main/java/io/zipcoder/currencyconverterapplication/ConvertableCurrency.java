package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {

    default Double convert(CurrencyType currencyType) {
        CurrencyType baseCurrency = getBaseCurrency();
        return currencyType.getRate() / baseCurrency.getRate();
    }

    CurrencyType getBaseCurrency();

}
