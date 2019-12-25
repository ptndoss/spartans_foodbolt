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

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;

@Entity
@Table(name = "TABLE_RESERVATION")
public class TableReservation {
	
	@Id
	@Column(name ="BOOKING_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int BookingID;
	
	@Column(name ="CUST_ID")
	int UserID;
	
	@Column(name ="RESTAURANT_ID")
	int RestaurantID;
	
	@Column(insertable=false)
	String RestaurantName="DummyRestaurant";
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name ="BOOKING_DATE")
	Date BookingDate;
	
	@DateTimeFormat(pattern = "HH:mm" )
	@Temporal(TemporalType.TIME)
	@Column(name ="BOOKING_TIME")
	Date BookingTime;
	
	@Column(name ="NO_OF_GUESTS")
	int no_of_guests;
	
	@Column(name ="STATUS")
	String status;
	
	public TableReservation() {
		super();
	}
	
	

	public TableReservation(int userID, int restaurantID, Date bookingTime, int no_of_guests ,String status ) {
		super();
		UserID = userID;
		RestaurantID = restaurantID;
		BookingTime = bookingTime;
		this.no_of_guests = no_of_guests;
		this.status = status;
	}
	

	public String  getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public int getBookingID() {
		return BookingID;
	}

	public void setBookingID(int bookingID) {
		BookingID = bookingID;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public int getRestaurantID() {
		return RestaurantID;
	}

	public void setRestaurantID(int restaurantID) {
		RestaurantID = restaurantID;
	}
	
	public String getRestaurantName() {
		return RestaurantName;
	}



	public void setRestaurantName(String restaurantName) {
		RestaurantName = restaurantName;
	}



	public Date getBookingDate() {
		return BookingDate;
	}



	public void setBookingDate(Date bookingDate) {
		BookingDate = bookingDate;
	}



	public Date getBookingTime() {
		return BookingTime;
	}

	public void setBookingTime(Date bookingTime) {
		BookingTime = bookingTime;
	}

	public int getNo_of_guests() {
		return no_of_guests;
	}

	public void setNo_of_guests(int no_of_guests) {
		this.no_of_guests = no_of_guests;
	}
	

}
