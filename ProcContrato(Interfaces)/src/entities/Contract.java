package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private Integer number;
	private Date date;
	private Double totalValues;
	
	List<Installment> installments = new ArrayList<Installment>();
	
	public Contract() {

	}
	
	public Contract(Integer number, Date date, Double totalValues) {
		super();
		this.number = number;
		this.date = date;
		this.totalValues = totalValues;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValues() {
		return totalValues;
	}

	public void setTotalValues(Double totalValues) {
		this.totalValues = totalValues;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
	
}
