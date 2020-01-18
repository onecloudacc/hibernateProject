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
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
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
 *1)One to Many mapping (user -> vehicle) One user can have multiple vehicles.
 * 2) Renaming the columns (This is optional)
 * A new table will be created with the userid and vehicle id
 * 
 */
@Entity
@Table(name="USER_DETAILSV5")
public class UserDetailsV5 {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	
	@OneToMany
	@JoinTable(joinColumns =@JoinColumn( name="USER_ID"),inverseJoinColumns = @JoinColumn( name="VEHICLE_ID")) //This is optional
	private Collection <VehicleV1> vehicles = new ArrayList<VehicleV1>();
	
	
	
	
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

	public Collection<VehicleV1> getVehicles() {
		return vehicles;
	}

	public void setVehicles(Collection<VehicleV1> vehicles) {
		this.vehicles = vehicles;
	}

	
	
	
	
	
}