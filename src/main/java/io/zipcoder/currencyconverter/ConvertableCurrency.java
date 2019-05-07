package io.zipcoder.currencyconverter;

public interface ConvertableCurrency {
    default Double getRate() {
        return CurrencyType.getTypeOfCurrency(this).getRate();
    }

    default Double convert(CurrencyType currencyType) {
        Double universalAmount = CurrencyType.UNIVERSAL_CURRENCY.getRate() / this.getRate() ;
        Double currencySpecificAmount = currencyType.getRate() * universalAmount;
        return currencySpecificAmount;
    }
}
