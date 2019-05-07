package com.pbkk.fp.RestaurantService.service;

import java.util.Optional;

public interface DictionaryServ<T> {

	public Iterable<T> findAll();
	
	public T save(T data);

	public Optional<T> findById(Long id);

	public void deleteById(Long id);
}
