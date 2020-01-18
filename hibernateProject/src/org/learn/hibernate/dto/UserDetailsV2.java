package org.learn.hibernate.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author rajes
 * date    Jul 5, 20175:05:47 PM
 *Demo for inserting collections into DB using hibernate: @elementcollection
 */
@Entity
//@Table(name="userdetailsv")
public class UserDetailsV2 {

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	
	// Suppose if the user is living in lot of address in a year.
	@Embedded
	@ElementCollection
	private Set <Address> setOfAddress = new HashSet();

	
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Set<Address> getSetOfAddress() {
		return setOfAddress;
	}

	public void setSetOfAddress(Set<Address> setOfAddress) {
		this.setOfAddress = setOfAddress;
	}
	
	
	
	
	
	
}
