package org.learn.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author rajes
 * date    Jul 6, 20175:38:37 PM
 *
 */
@Entity
public class VehicleV11 {

@Id
@GeneratedValue (strategy=GenerationType.AUTO)
private int vehicleId;
private String vehicleName;

@ManyToOne
@JoinColumn(name="USER_ID")
private UserDetailsV51 user;

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
public UserDetailsV51 getUser() {
	return user;
}
public void setUser(UserDetailsV51 user) {
	this.user = user;
}













}
