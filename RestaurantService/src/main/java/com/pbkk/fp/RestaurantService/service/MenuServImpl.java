package com.pbkk.fp.RestaurantService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pbkk.fp.RestaurantService.entity.Menu;
import com.pbkk.fp.RestaurantService.service.MenuServ;
import com.pbkk.fp.RestaurantService.repository.MenuRepository;

public class MenuServImpl implements MenuServ {

	@Autowired
	private MenuRepository menuRepository;
	
	@Override
	public Iterable<Menu> getAllMenu() {
		return menuRepository.findAll();
	}

}
