package org.learn.hibernate.dto;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.NotFound;

/**
 * @author rajes
 * date    Jul 3, 20172:33:58 PM
 *
 */
@Entity
@Table (name="user_details")
public class UserDetails {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int userId;
@Column (name="user_name")
private String userName;

@Transient
private String columnToBeDropped;

@Embedded
private Address addr;

@Embedded
private PhoneDetails mobileNo;

@Embedded
@AttributeOverride(name="contactNo", column= @Column(name="LANDLINE_NO"))
private PhoneDetails landLineNo;

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
public String getColumnToBeDropped() {
	return columnToBeDropped;
}
public void setColumnToBeDropped(String columnToBeDropped) {
	this.columnToBeDropped = columnToBeDropped;
}
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	this.addr = addr;
}
public PhoneDetails getMobileNo() {
	return mobileNo;
}
public void setMobileNo(PhoneDetails mobileNo) {
	this.mobileNo = mobileNo;
}
public PhoneDetails getLandLineNo() {
	return landLineNo;
}
public void setLandLineNo(PhoneDetails landLineNo) {
	this.landLineNo = landLineNo;
}



	
}
