package com.pbkk.fp.RestaurantService.entity;

import javax.persistence.*;

@Entity
@Table(name="menu")
public class Menu extends Restaurant{
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	//private Long id;
	//@Embeddable
	@ManyToOne
	//@JoinColumn(name="restaurant", referencedColumnName="id")
	
	private Restaurant restaurant;
	private String namaMakan;
	private String deskripsi;
	private String alamat;
	private String nama;
	
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
	/*public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}*/
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
}
