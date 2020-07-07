package com.aarthyswaminathan.currencyconversion.dto;

public class Currency {

	private String fromCcy;
	private Double fromAmt;
	private String toCcy;
	private Double toAmt;
	public Currency() {
	}
	
	public Currency(String fromCcy, Double fromAmt, String toCcy, Double toAmt) {
		super();
		this.fromCcy = fromCcy;
		this.fromAmt = fromAmt;
		this.toCcy = toCcy;
		this.toAmt = toAmt;
	}

	public String getFromCcy() {
		return fromCcy;
	}
	public void setFromCcy(String fromCcy) {
		this.fromCcy = fromCcy;
	}
	public Double getFromAmt() {
		return fromAmt;
	}
	public void setFromAmt(Double fromAmt) {
		this.fromAmt = fromAmt;
	}
	public String getToCcy() {
		return toCcy;
	}
	public void setToCcy(String toCcy) {
		this.toCcy = toCcy;
	}
	public Double getToAmt() {
		return toAmt;
	}
	public void setToAmt(Double toAmt) {
		this.toAmt = toAmt;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fromAmt == null) ? 0 : fromAmt.hashCode());
		result = prime * result + ((fromCcy == null) ? 0 : fromCcy.hashCode());
		result = prime * result + ((toAmt == null) ? 0 : toAmt.hashCode());
		result = prime * result + ((toCcy == null) ? 0 : toCcy.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Currency other = (Currency) obj;
		if (fromAmt == null) {
			if (other.fromAmt != null)
				return false;
		} else if (!fromAmt.equals(other.fromAmt))
			return false;
		if (fromCcy == null) {
			if (other.fromCcy != null)
				return false;
		} else if (!fromCcy.equals(other.fromCcy))
			return false;
		if (toAmt == null) {
			if (other.toAmt != null)
				return false;
		} else if (!toAmt.equals(other.toAmt))
			return false;
		if (toCcy == null) {
			if (other.toCcy != null)
				return false;
		} else if (!toCcy.equals(other.toCcy))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Currency [fromCcy=" + fromCcy + ", fromAmt=" + fromAmt + ", toCcy=" + toCcy + ", toAmt=" + toAmt + "]";
	}
	
	
}
