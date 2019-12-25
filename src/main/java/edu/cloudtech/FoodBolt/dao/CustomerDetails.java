package edu.cloudtech.FoodBolt.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "CUST_DETAILS")
public class CustomerDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CUST_ID")
	int cust_id;
	
	@Column(name = "FIRST_NAME")
	String first_name;

	
	@Column(name = "LAST_NAME")
	String last_name;
	
	@Column(name = "EMAIL")
	String email;
	
	
	@Column(name = "CITY")
	String city;
	
	@Column(name = "STATE")
	String state;
	
	@Column(name = "PREF_CUISIN_TYP")
	String pref_cuisin_typ;
	
	@Column(name = "DEFAULT_GUESTS")
	int default_guests;
	
	@Column(name = "IS_ACTIVE")
	String is_active;
	
	@Column(name = "PASSWORD")
	String password;
	
	@Column(name = "PREF_RESTAURANTID")
	int pref_restaurantID;
	
	@DateTimeFormat(pattern = "HH:mm" )
	@Temporal(TemporalType.TIME)
	@Column(name = "BOOKING_TIME")
	Date pref_bookingTime;
	


	public CustomerDetails(String first_name, String last_name, String email, String city,
			String state, String pref_cuisin_typ, int default_guests) {
		super();
		this.first_name = first_name;
		
		this.last_name = last_name;
		this.email = email;
		this.city = city;
		this.state = state;
		this.pref_cuisin_typ = pref_cuisin_typ;
		this.default_guests = default_guests;
	}
	
	public CustomerDetails() {
		super();
	}
	
	

	public int getPref_restaurantID() {
		return pref_restaurantID;
	}

	public void setPref_restaurantID(int pref_restaurantID) {
		this.pref_restaurantID = pref_restaurantID;
	}

	public Date getPref_bookingTime() {
		return pref_bookingTime;
	}

	public void setPref_bookingTime(Date pref_bookingTime) {
		this.pref_bookingTime = pref_bookingTime;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPref_cuisin_typ() {
		return pref_cuisin_typ;
	}

	public void setPref_cuisin_typ(String pref_cuisin_typ) {
		this.pref_cuisin_typ = pref_cuisin_typ;
	}

	public int getDefault_guests() {
		return default_guests;
	}

	public void setDefault_guests(int default_guests) {
		this.default_guests = default_guests;
	}

	public String getIs_active() {
		return is_active;
	}

	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
