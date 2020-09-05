package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Hotel;

@Repository
public interface HotelRepository extends CrudRepository<Hotel, Integer>{
	public List<Hotel> findByLocation(String location);

}
