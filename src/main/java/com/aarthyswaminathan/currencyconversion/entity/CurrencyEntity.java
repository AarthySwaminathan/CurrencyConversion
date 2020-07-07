package com.aarthyswaminathan.currencyconversion.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity(name = "CURRENCY_RATES")
@Table(name = "CURRENCY_RATES")
@IdClass(CurrencyId.class)
public class CurrencyEntity {

	@Id
	@Column(name="FROM_CURRENCY")
	private String fromCurrency;
	@Id
	@Column(name="TO_CURRENCY")
	private String toCurrency;
	private double rate;
	public String getFromCurrency() {
		return fromCurrency;
	}
	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}
	public String getToCurrency() {
		return toCurrency;
	}
	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(fromCurrency, rate, toCurrency);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CurrencyEntity)) {
			return false;
		}
		CurrencyEntity other = (CurrencyEntity) obj;
		return Objects.equals(fromCurrency, other.fromCurrency) 
				&& Double.doubleToLongBits(rate) == Double.doubleToLongBits(other.rate)
				&& Objects.equals(toCurrency, other.toCurrency);
	}
	@Override
	public String toString() {
		return "CurrencyEntity [fromCurrency=" + fromCurrency + ", toCurrency=" + toCurrency + ", rate="
				+ rate + "]";
	}

}
