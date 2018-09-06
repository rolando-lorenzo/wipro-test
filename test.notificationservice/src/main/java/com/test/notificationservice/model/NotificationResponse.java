package com.test.notificationservice.model;

import java.io.Serializable;

public class NotificationResponse implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5337552628384362288L;

	private UserNotification userNotification;

	private Account account;

	/**
	 * @return the userNotification
	 */
	public UserNotification getUserNotification() {
		return userNotification;
	}

	/**
	 * @param userNotification
	 *            the userNotification to set
	 */
	public void setUserNotification(UserNotification userNotification) {
		this.userNotification = userNotification;
	}

	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * @param account
	 *            the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

}
