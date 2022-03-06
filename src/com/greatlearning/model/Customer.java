/**
 * 
 */
package com.greatlearning.model;

/**
 * @author rahulkumar
 *
 */

public class Customer {
	private String bankAccountNo;
	private String password;
	
	public Customer(String bankAccountNo, String password) {
		this.bankAccountNo = bankAccountNo;
		this.password = password;
	}
	/**
	 * @return the bankAccountNo
	 */
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	/**
	 * @param bankAccountNo the bankAccountNo to set
	 */
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
