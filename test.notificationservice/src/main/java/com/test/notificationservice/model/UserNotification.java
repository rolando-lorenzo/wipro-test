package com.test.notificationservice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "user_notification")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserNotification implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1856115649217806562L;

	@Id
	private Long id;

	private String firstName;

	private String lastName;

	private String phone;

	private String notificationSettigs;

	private Long accountId;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the notificationSettigs
	 */
	public String getNotificationSettigs() {
		return notificationSettigs;
	}

	/**
	 * @param notificationSettigs
	 *            the notificationSettigs to set
	 */
	public void setNotificationSettigs(String notificationSettigs) {
		this.notificationSettigs = notificationSettigs;
	}

	/**
	 * @return the accountId
	 */
	public Long getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	

}
