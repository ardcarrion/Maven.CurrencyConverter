package io.zipcoder.currencyconverter;

public interface ConvertableCurrency {
    default Double getRate() { return Double.MAX_VALUE; }
    default Double convert(CurrencyType currencyType) { return Double.MIN_VALUE; }
}
