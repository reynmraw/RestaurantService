package com.pbkk.fp.RestaurantService.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pbkk.fp.RestaurantService.entity.Restaurant;
import com.pbkk.fp.RestaurantService.service.RestaurantServ;

@RestController
public class RestaurantController {
	@Autowired
	private RestaurantServ restaurantServ;
	
	@GetMapping("/restaurants")
	public Iterable<Restaurant> getAllRestaurant() {
		return restaurantServ.findAll();
	}
	
	@GetMapping("/restaurants/{id}")
	public Optional<Restaurant> getRestaurantById(
			@PathVariable Long id) {
		return restaurantServ.findById(id);
	}
	
	@PostMapping("/restaurants") 
	public Restaurant postRestaurant(
			@ModelAttribute Restaurant Restaurant) {
		return (com.pbkk.fp.RestaurantService.entity.Restaurant) restaurantServ.save(Restaurant);
	}
	
	@PutMapping("/restaurants/{id}")
	public Restaurant putRestaurant(
			@PathVariable Long id, 
			@ModelAttribute Restaurant Restaurant) {
		Restaurant.setId(id);
		return (com.pbkk.fp.RestaurantService.entity.Restaurant) restaurantServ.save(Restaurant);
	}
	
	@DeleteMapping("/restaurants/{id}")
	public void deleteRestaurant(
			@PathVariable Long id) {
		restaurantServ.deleteById(id);
	}
}
