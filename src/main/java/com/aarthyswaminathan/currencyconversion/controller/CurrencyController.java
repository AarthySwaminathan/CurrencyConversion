package com.aarthyswaminathan.currencyconversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aarthyswaminathan.currencyconversion.dto.Currency;
import com.aarthyswaminathan.currencyconversion.service.CurrencyService;

@RestController
@RequestMapping("/api")
public class CurrencyController {
	
	@Autowired
	private CurrencyService currencyService;

	@PostMapping("/convert")
	public Currency getRates(@RequestBody Currency c) {
		return currencyService.convert(c);
	}
	
	@PostMapping("/save")
	public Currency save(@RequestBody Currency c) {
		return currencyService.save(c);
	}
}
