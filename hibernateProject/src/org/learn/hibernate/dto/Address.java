package org.learn.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author rajes
 * date    Jul 5, 201711:31:24 AM
 *
 */
@Embeddable
public class Address {

	@Column (name="STREET_NAME")
	private String street;
	private String city;
	private String state;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
