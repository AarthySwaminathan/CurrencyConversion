package com.aarthyswaminathan.currencyconversion.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aarthyswaminathan.currencyconversion.dto.Currency;
import com.aarthyswaminathan.currencyconversion.entity.CurrencyEntity;
import com.aarthyswaminathan.currencyconversion.repository.CurrencyRepository;

@Service
public class CurrencyServiceImpl implements CurrencyService {
	
	private static final Logger logger = LoggerFactory.getLogger(CurrencyServiceImpl.class);
	
	@Autowired
	private CurrencyRepository currencyRepository;
	
	@Override
	public Currency convert(Currency c) {
		CurrencyEntity currency = currencyRepository.findByCurrency(c.getFromCcy(), c.getToCcy());
		if(currency == null)
			return null;
		c.setToAmt(currency.getRate() * c.getFromAmt());
		return c;
		
	}

	@Override
	public Currency save(Currency c) {
		CurrencyEntity entity = new CurrencyEntity();
		entity.setFromCurrency(c.getFromCcy());
		entity.setToCurrency(c.getToCcy());
		entity.setRate(c.getToAmt());
		CurrencyEntity savedCurrency = currencyRepository.save(entity);
		logger.info("Currency inserted {}", savedCurrency);
		c.setFromAmt(1D);
		return convert(c);
	}

}
