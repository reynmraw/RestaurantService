package com.pbkk.fp.RestaurantService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pbkk.fp.RestaurantService.entity.Restaurant;
import com.pbkk.fp.RestaurantService.service.RestaurantServ;
import com.pbkk.fp.RestaurantService.repository.RestaurantRepository;;

@Component("restaurantService")
public class RestaurantServImpl implements RestaurantServ{
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	
	@Override
	public Iterable<Restaurant> getAllRestaurants() {
		return restaurantRepository.findAll();
	}

	
}
