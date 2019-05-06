package com.pbkk.fp.RestaurantService.entity;

import javax.persistence.*;

@Entity
@Table(name="menu")
public class Menu extends Restaurant{
	@ManyToOne
	@JoinColumn(name="users_id", referencedColumnName="id")
	private Restaurant restaurant;
	private String namaMakan;
	private String deskripsi;
	
	public String getNamaMakan() {
		return namaMakan;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public void setNamaMakan(String namaMakan) {
		this.namaMakan = namaMakan;
	}
	public String getDeskripsi() {
		return deskripsi;
	}
	public void setDeskripsi(String deskripsi) {
		this.deskripsi = deskripsi;
	}
}
