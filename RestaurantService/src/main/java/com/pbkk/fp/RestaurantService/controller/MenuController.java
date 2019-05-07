package com.pbkk.fp.RestaurantService.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pbkk.fp.RestaurantService.entity.Menu;
import com.pbkk.fp.RestaurantService.service.MenuServ;

@RestController
public class MenuController {
	@Autowired
	private MenuServ menuServ;
	
	@GetMapping("/menu")
	public Iterable<Menu> getAllMenu(){
		return menuServ.findAll();
	}
}
