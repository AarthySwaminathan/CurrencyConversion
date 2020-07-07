package com.aarthyswaminathan.currencyconversion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.aarthyswaminathan.currencyconversion.entity.CurrencyEntity;

@Repository
public interface CurrencyRepository extends JpaRepository<CurrencyEntity, Integer> {
	@Query("SELECT c from CURRENCY_RATES c WHERE c.fromCurrency=:fromCurrency AND c.toCurrency=:toCurrency")
	CurrencyEntity findByCurrency(@Param("fromCurrency") String fromCurrency, @Param("toCurrency") String toCurrency);

}
