package com.pbkk.fp.RestaurantService.entity;

import javax.persistence.*;

@Entity
@Table(name="menu")
public class Menu extends Restaurant{
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private Restaurant restaurant;
	private String namaMakan;
	private String deskripsi;
	public String getNamaMakan() {
		return namaMakan;
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
