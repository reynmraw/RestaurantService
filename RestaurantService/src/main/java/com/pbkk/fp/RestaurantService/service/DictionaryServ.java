package com.pbkk.fp.RestaurantService.service;

import java.util.Optional;

import com.pbkk.fp.RestaurantService.entity.Menu;
import com.pbkk.fp.RestaurantService.entity.Restaurant;

public interface DictionaryServ<T> {
	/* public Iterable<Restaurant> getAllRestaurants(); */

	public Iterable<T> findAll();

	public Optional<T> findById(Long id);

	public void deleteById(Long id);

	public T save(T data);
	
	public T update(T data);
	
	/*
	 * public Iterable<Menu> getAllMenu();
	 * 
	 * public Iterable<Menu> findAllMenu();
	 * 
	 * public Optional<Menu> findByIdMenu(Long id);
	 * 
	 * public void deleteByIdMenu(Long id);
	 * 
	 * public Menu save(Menu data);
	 */
}
