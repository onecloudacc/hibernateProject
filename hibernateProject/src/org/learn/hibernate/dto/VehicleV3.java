package org.learn.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * @author rajes
 * date    Jul 6, 20175:38:37 PM
 * Many to many Demo
 *
 */
@Entity
public class VehicleV3 {

@Id
@GeneratedValue (strategy=GenerationType.AUTO)
private int vehicleId;
private String vehicleName;

@ManyToMany(mappedBy="vehicles") // to reduce the duplicate tables
private Collection <UserDetailsV7> user = new ArrayList<UserDetailsV7>();



public int getVehicleId() {
	return vehicleId;
}
public void setVehicleId(int vehicleId) {
	this.vehicleId = vehicleId;
}
public String getVehicleName() {
	return vehicleName;
}
public void setVehicleName(String vehicleName) {
	this.vehicleName = vehicleName;
}
public Collection<UserDetailsV7> getUser() {
	return user;
}
public void setUser(Collection<UserDetailsV7> user) {
	this.user = user;
}









}
