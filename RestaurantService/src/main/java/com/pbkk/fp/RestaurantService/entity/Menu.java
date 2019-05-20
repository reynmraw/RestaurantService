package com.pbkk.fp.RestaurantService.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="menu")
public class Menu implements Serializable {
	/*
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	//@Embeddable
	//@JoinColumn(name="restaurant", referencedColumnName="id")
	
	private String namaMakan;
	private String deskripsi;
	private Integer stok;
	private String harga;
	@ManyToOne
	private Restaurant restaurant;
	//private String alamat;
	//private String nama;
	
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getStok() {
		return stok;
	}
	public void setStok(Integer stok) {
		this.stok = stok;
	}
	public String getHarga() {
		return harga;
	}
	public void setHarga(String harga) {
		this.harga = harga;
	}
	/*public String getAlamat() {
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
	}*/
}
