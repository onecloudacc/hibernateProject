package org.learn.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author rajes
 * date    Jul 6, 201712:04:00 PM
 * 
 *This is to demonstrate the usage of 
 *1)One to One mapping (user -> vehicle)
 *2)Create a vehicle entity for mapping 
 *
 *3)Renaming the column
 */
@Entity
@Table(name="USER_DETAILSV4")
public class UserDetailsV4 {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	
	@OneToOne
	@JoinColumn (name="VEHICLE_ID")
	private VehicleV1 v1;
	
	
	
	
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

	public VehicleV1 getV1() {
		return v1;
	}

	public void setV1(VehicleV1 v1) {
		this.v1 = v1;
	}

	
	
	
	
	
}