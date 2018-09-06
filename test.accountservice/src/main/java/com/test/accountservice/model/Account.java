package com.test.accountservice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "account")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1830174826686770087L;
	
	/**
	 * name
	 */
	@Id
	private Long id;
	
	/**
	 * incomes
	 */
	private String incomes;
	
	/**
	 * expenses
	 */
	private String expenses;
	
	/**
	 * settings
	 */
	private String settings;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the incomes
	 */
	public String getIncomes() {
		return incomes;
	}

	/**
	 * @param incomes the incomes to set
	 */
	public void setIncomes(String incomes) {
		this.incomes = incomes;
	}

	/**
	 * @return the expenses
	 */
	public String getExpenses() {
		return expenses;
	}

	/**
	 * @param expenses the expenses to set
	 */
	public void setExpenses(String expenses) {
		this.expenses = expenses;
	}

	/**
	 * @return the settings
	 */
	public String getSettings() {
		return settings;
	}

	/**
	 * @param settings the settings to set
	 */
	public void setSettings(String settings) {
		this.settings = settings;
	}

}
