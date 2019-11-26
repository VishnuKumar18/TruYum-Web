/**
 * 
 */
package com.cognizant.truyum.dao;

/**
 * @author VishnuKumar
 *
 */
public class CartEmptyException extends Exception {
	private String message;

	public CartEmptyException(String message) {
		this.message = message;

	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
