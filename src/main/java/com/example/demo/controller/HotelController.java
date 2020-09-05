package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Hotel;
import com.example.demo.repository.HotelRepository;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HotelController {
	@Autowired
	private HotelRepository dummyHotel;
	
	
	@PostMapping("/hotels")
    public Hotel create(@RequestBody Hotel hotel) {
        dummyHotel.save(hotel);
        return hotel;
    }

	 @GetMapping("/hotels")	
	    public List<Hotel> getAllHotels() {
		  return (List<Hotel>) dummyHotel.findAll();
		}
	@GetMapping("/hotels/{id}")
	public Optional<Hotel> getHotelById(@PathVariable("id") int id) {
	  return dummyHotel.findById(id);
	}
	@RequestMapping(value = "/hotels/{id}", method = RequestMethod.PUT)
	  public void modifyHotelById(@PathVariable("id") int id, @Valid @RequestBody Hotel hotel) {
	    hotel.setId(id);
	    dummyHotel.save(hotel);
	  }
//	@GetMapping("/hotels/{location}")	
//    public List<Hotel> getByLocation(@PathVariable("location") String location) {
//	  return (List<Hotel>) dummyHotel.findByLocation(location);
//	}
	  
//	  @RequestMapping(value = "/", method = RequestMethod.POST)
//	  public String createHotel(@RequestParam int id,@RequestParam String hotelName, @RequestParam String hotelType, @RequestParam int price,@RequestParam String location) {
//		  dummyHotel.save(new Hotel(id,hotelName,hotelType,price,location));
//	    return dummyHotel.toString();
//	  }
	  
	  @RequestMapping(value = "hotels/{id}", method = RequestMethod.DELETE)
	  public void deleteHotel(@PathVariable int id) {
	    dummyHotel.delete(dummyHotel.findById(id).orElse(null));
	  }


}
