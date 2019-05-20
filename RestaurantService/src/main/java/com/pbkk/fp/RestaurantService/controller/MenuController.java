package com.pbkk.fp.RestaurantService.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pbkk.fp.RestaurantService.entity.Menu;
import com.pbkk.fp.RestaurantService.service.MenuServ;

@RestController
@RequestMapping("/menu")
public class MenuController {
	@Autowired
	private MenuServ menuServ;
	
	@GetMapping("/menu")
	public Iterable<Menu> getAllMenu(){
		return menuServ.findAll();
	}
	
	@GetMapping("/menu/{id}")
	public Optional<Menu> getMenuById(
			@PathVariable Long id) {
		return menuServ.findById(id);
	}
	
	@PostMapping("/menu") 
	public Menu postMenu(
			@ModelAttribute Menu Menu) {
		return menuServ.save(Menu);
	}
	
	@PutMapping("/menu/{id}")
	public Menu putMenu(
			@PathVariable Long id, 
			@ModelAttribute Menu Menu) {
		Menu.setId(id);
		return menuServ.save(Menu);
	}
	
	@DeleteMapping("/menu/{id}")
	public void deleteMenu(
			@PathVariable Long id) {
		menuServ.deleteById(id);
	}
}
