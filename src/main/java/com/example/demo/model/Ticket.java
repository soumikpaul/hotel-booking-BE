package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Ticket {
	@Id 
//	@GeneratedValue
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int ticketid;
	String name;
	String phone;
	int noOfPersons;
	String dateFrom;
	String dateTo;
	int hotelId;
	
	
	public Ticket() {
		super();
	}
	public Ticket(int bookid, String name, String phone, int noOfPersons, String dateFrom, String dateTo,
			int hotelId) {
		super();
		this.ticketid = bookid;
		this.name = name;
		this.phone = phone;
		this.noOfPersons = noOfPersons;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.hotelId = hotelId;
	}
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getNoOfPersons() {
		return noOfPersons;
	}
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public String getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}
	public String getDateTo() {
		return dateTo;
	}
	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	@Override
	public String toString() {
		return "Booking [bookid=" + ticketid + ", name=" + name + ", phone=" + phone + ", noOfPersons=" + noOfPersons
				+ ", dateFrom=" + dateFrom + ", dateTo=" + dateTo + ", hotelId=" + hotelId + "]";
	}
	
}
	
