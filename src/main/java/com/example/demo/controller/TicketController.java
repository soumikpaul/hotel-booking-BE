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
import com.example.demo.model.Ticket;
import com.example.demo.repository.TicketRepository;




@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TicketController {
	@Autowired
	private TicketRepository dummyTicket;
	
	@PostMapping("/tickets")
    public Ticket create(@RequestBody Ticket ticket) {
        dummyTicket.save(ticket);
        return ticket;
    }

	 @GetMapping("/tickets")	
	    public List<Ticket> getAllHotels() {
		  return (List<Ticket>) dummyTicket.findAll();
		}
	@GetMapping("/tickets/{id}")
	public Optional<Ticket> getHotelById(@PathVariable("id") int id) {
	  return dummyTicket.findById(id);
	}
	@RequestMapping(value = "/tickets/{id}", method = RequestMethod.PUT)
	  public void modifyTicketById(@PathVariable("id") int id, @Valid @RequestBody Ticket ticket) {
	    ticket.setTicketid(id);
	    dummyTicket.save(ticket);
	  }
//	@GetMapping("/tickets/{location}")	
//    public List<Ticket> getByLocation(@PathVariable("location") String location) {
//	  return (List<Ticket>) dummyTicket.findByLocation(location);
//	}
//	  
//	  @RequestMapping(value = "/", method = RequestMethod.POST)
//	  public String createHotel(@RequestParam int id,@RequestParam String hotelName, @RequestParam String hotelType, @RequestParam int price,@RequestParam String location) {
//		  dummyHotel.save(new Hotel(id,hotelName,hotelType,price,location));
//	    return dummyHotel.toString();
//	  }
	  
	  @RequestMapping(value = "/tickets/{id}", method = RequestMethod.DELETE)
	  public void deleteHotel(@PathVariable int id) {
	    dummyTicket.delete(dummyTicket.findById(id).orElse(null));
	  }

	
	

}
