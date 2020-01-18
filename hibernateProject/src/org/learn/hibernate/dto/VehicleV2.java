package org.learn.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author rajes
 * date    Jul 6, 20175:38:37 PM
 *
 */
@Entity
public class VehicleV2 {

@Id
@GeneratedValue (strategy=GenerationType.AUTO)
private int vehicleId;
private String vehicleName;

@ManyToOne
private UserDetailsV6 userDetailsv6;

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
public UserDetailsV6 getUserDetailsv6() {
	return userDetailsv6;
}
public void setUserDetailsv6(UserDetailsV6 userDetailsv6) {
	this.userDetailsv6 = userDetailsv6;
}










}
