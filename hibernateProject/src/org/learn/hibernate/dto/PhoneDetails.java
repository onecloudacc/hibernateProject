package org.learn.hibernate.dto;

import javax.persistence.Embeddable;

/**
 * @author rajes
 * date    Jul 5, 201711:53:22 AM
 *
 */
@Embeddable
public class PhoneDetails {

	private int contactNo;

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	
	
	
	
}
