package com.pbkk.fp.RestaurantService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pbkk.fp.RestaurantService.entity.Menu;
import com.pbkk.fp.RestaurantService.service.MenuServ;
import com.pbkk.fp.RestaurantService.repository.MenuRepository;

@Component("menuServ")
public class MenuServImpl implements MenuServ {

	@Autowired
	private MenuRepository menuRepository;

	@Override
	public Iterable<Menu> findAll() {
		return menuRepository.findAll();
	}

	@Override
	public Optional findById(Long id) {
		return menuRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		menuRepository.deleteById(id);
		
	}

	@Override
	public Object save(Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object update(Object data) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	 * @Override public Iterable<Menu> getAllMenu() { return
	 * menuRepository.findAll(); }
	 */
	
	}
