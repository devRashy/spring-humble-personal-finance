package com.pmz.humble.model;


import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pmz.humble.factories.CurrencyFactory;
import com.pmz.humble.interfaces.Currency;

public class User {
	

	private int id;
	private String username;
	
	@JsonIgnore
	private String password;
	private String email;
	private Date registrationDate;
	private double balance;
	private Currency currency;
		

	public User(String username, String password, String email, Date registrationDate, 
			double ammount, int currencyId) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.registrationDate = registrationDate;
		this.balance = ammount;
		this.currency = CurrencyFactory.getCurrency(currencyId);
	}
	
	public User(String username, String password, String email, Date registrationDate
			, double ammount, Currency currency) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.registrationDate = registrationDate;
		this.balance = ammount;
		this.currency = currency;
	}
	
	public User(String username, String password, String email, double ammount, int currencyId) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.balance = ammount;
		this.currency = CurrencyFactory.getCurrency(currencyId);
	}
	
	public User(int id, String username, String password, String email, Date registrationDate,
			 double ammount, int currencyId) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.registrationDate = registrationDate;
		this.balance = ammount;
		this.currency = CurrencyFactory.getCurrency(currencyId);
	}
	
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double ammount) {
		this.balance = ammount;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email
				+ ", registrationDate=" + registrationDate + ", balance=" + balance
				+ ", currency=" + currency + "]";
	}

}
