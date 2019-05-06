package com.pbkk.fp.RestaurantService.service;

import java.util.Optional;

import com.pbkk.fp.RestaurantService.entity.Restaurant;

public interface DictionaryServ {
	public Iterable<Restaurant> getAllRestaurants();

	public Iterable<Restaurant> findAll();

	public Optional<Restaurant> findById(Long id);

	public void deleteById(Long id);

	public Restaurant save(Restaurant data);	
}
