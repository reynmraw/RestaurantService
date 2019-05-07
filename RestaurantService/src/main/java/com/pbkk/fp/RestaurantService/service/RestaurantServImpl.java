package com.pbkk.fp.RestaurantService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pbkk.fp.RestaurantService.entity.Restaurant;
import com.pbkk.fp.RestaurantService.service.RestaurantServ;
import com.pbkk.fp.RestaurantService.repository.RestaurantRepository;

@Component("restaurantServ")
public class RestaurantServImpl implements RestaurantServ{
	@Autowired
	private RestaurantRepository restaurantRepository;

	@Override
	public void deleteById(Long id) {
		restaurantRepository.deleteById(id);
	}

	@Override
	public Iterable<Restaurant> findAll() {
		return restaurantRepository.findAll();
	}

	@Override
	public Optional<Restaurant> findById(Long id) {
		return restaurantRepository.findById(id);
	}
	
	@Override
	public Restaurant save(Restaurant data) {
		return restaurantRepository.save(data);
	}
	
}
