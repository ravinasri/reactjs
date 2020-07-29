package com.example.react.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class AccountHolder {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customer_id;
	private String customer_name;
	private String customer_address;
	private String account_type;
	private String account_number;
	private String nomination;
	
	public AccountHolder() {
		super();
	}

	public AccountHolder(String customer_name, String customer_address, String account_type, String account_number,
			String nomination) {
		super();
		this.customer_name = customer_name;
		this.customer_address = customer_address;
		this.account_type = account_type;
		this.account_number = account_number;
		this.nomination = nomination;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_address() {
		return customer_address;
	}

	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getNomination() {
		return nomination;
	}

	public void setNomination(String nomination) {
		this.nomination = nomination;
	}

	@Override
	public String toString() {
		return "AccountHolder [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_address="
				+ customer_address + ", account_type=" + account_type + ", account_number=" + account_number
				+ ", nomination=" + nomination + "]";
	}
	
	

}
