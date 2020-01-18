package org.learn.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author rajes
 * date    Jul 6, 201712:04:00 PM
 * 
 *This is to demonstrate the usage of 
 *1) Rename the foreign table name
 *2) Rename the foreign key column name in foreign table
 *converting set to arraylist (as it has the index)
 *3) Creating the primary key for  the foreign table
 */
@Entity
@Table(name="USER_DETAILSV3")
public class UserDetailsV3 {

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	
	// Suppose if the user is living in lot of address in a year.
	@Embedded
	@ElementCollection
	@JoinTable(name="USER_ADDRESS" , joinColumns=@JoinColumn(name="USER_ID"))
	@GenericGenerator(name="sequence-gen",strategy="sequence")
	@CollectionId(columns = { @Column (name="ADDRESS_ID") }, generator = "sequence-gen", type = @Type(type = "long"))
	private Collection <Address> setOfAddress = new ArrayList<Address>();

	
	
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

	public Collection<Address> getSetOfAddress() {
		return setOfAddress;
	}

	public void setSetOfAddress(Collection<Address> setOfAddress) {
		this.setOfAddress = setOfAddress;
	}

	
	
	
	
	
	
}