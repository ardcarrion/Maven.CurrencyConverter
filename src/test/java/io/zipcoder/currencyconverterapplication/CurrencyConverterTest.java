package io.zipcoder.currencyconverterapplication;


public class CurrencyConverterTest {
    public Double convert(Double amountOfBaseCurrency, ConvertableCurrency currency, CurrencyType currencyTypeToConvertTo) {
        return currency.convert(currencyTypeToConvertTo) * amountOfBaseCurrency;
    }
}
