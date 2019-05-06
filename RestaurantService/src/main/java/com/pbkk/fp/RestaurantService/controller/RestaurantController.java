package com.pbkk.fp.RestaurantService.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pbkk.fp.RestaurantService.entity.Restaurant;
import com.pbkk.fp.RestaurantService.service.RestaurantServ;

@RestController
public class RestaurantController {
	@Autowired
	private RestaurantServ restaurantServ;
	
	@GetMapping("/restaurant")
	public Iterable<Restaurant> getAllRestaurants(){
		return restaurantServ.getAllRestaurants();
	}
}
