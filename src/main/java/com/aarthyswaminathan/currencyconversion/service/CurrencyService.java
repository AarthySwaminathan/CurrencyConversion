package com.aarthyswaminathan.currencyconversion.service;

import com.aarthyswaminathan.currencyconversion.dto.Currency;

public interface CurrencyService {

	Currency convert(Currency c);
	
	Currency save(Currency c);
}
