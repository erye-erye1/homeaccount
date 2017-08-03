package com.erye.entities;

import java.sql.Date;

public class Account {

	private Integer id;
	private Double sum;
	private Double an;
	private Double han;
	private Double extraincome;
	private Date create_time;
	
	public Account() {
		super();
	}
	public Account(Integer id, Double sum, Double an, Double han, Double extraincome, Date create_time) {
		super();
		this.id = id;
		this.sum = sum;
		this.an = an;
		this.han = han;
		this.extraincome = extraincome;
		this.create_time = create_time;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getSum() {
		return sum;
	}
	public void setSum(Double sum) {
		this.sum = sum;
	}
	public Double getAn() {
		return an;
	}
	public void setAn(Double an) {
		this.an = an;
	}
	public Double getHan() {
		return han;
	}
	public void setHan(Double han) {
		this.han = han;
	}
	public Double getExtraincome() {
		return extraincome;
	}
	public void setExtraincome(Double extraincome) {
		this.extraincome = extraincome;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", sum=" + sum + ", an=" + an + ", han=" + han + ", extraincome=" + extraincome
				+ "]";
	}
	
}
