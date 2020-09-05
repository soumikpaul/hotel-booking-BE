package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Hotel {
	@Id 
//	@GeneratedValue
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String hotelName;
	String hotelType;
	int price;
	String location;
	String imgurl;
//	int roomsAvail;
	
	public Hotel() {
		super();
	}
	public Hotel(int id, String hotelName, String hotelType, int price, String location,String imgurl) {
		super();
		this.id = id;
		this.hotelName = hotelName;
		this.hotelType = hotelType;
		this.price = price;
		this.location = location;
		this.imgurl=imgurl;
	}
	
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelType() {
		return hotelType;
	}
	public void setHotelType(String hotelType) {
		this.hotelType = hotelType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", hotelName=" + hotelName + ", hotelType=" + hotelType + ", price=" + price
				+ ", location=" + location + "]";
	}
	

}
