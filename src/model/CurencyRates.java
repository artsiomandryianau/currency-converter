package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

public class CurencyRates {
	
	private Curency base;
	private LocalDate date;
	private Map<Curency, BigDecimal> rates;
	
	public CurencyRates() {
	}

	public CurencyRates(Curency base, LocalDate date, Map<Curency, BigDecimal> rates) {
		this.base = base;
		this.date = date;
		this.rates = rates;
	}

	public Curency getBase() {
		return base;
	}

	public void setBase(Curency base) {
		this.base = base;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Map<Curency, BigDecimal> getRates() {
		return rates;
	}

	public void setRates(Map<Curency, BigDecimal> rates) {
		this.rates = rates;
	}

	
	
	
	
}
