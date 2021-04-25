package com.app.restservices.hello;

public class UserDetails {
private String FirstName;
private String LastName;
private String city;
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public UserDetails(String firstName, String lastName, String city) {
	FirstName = firstName;
	LastName = lastName;
	this.city = city;
}



}
