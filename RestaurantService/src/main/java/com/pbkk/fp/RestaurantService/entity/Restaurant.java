package com.pbkk.fp.RestaurantService.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
//import com.pbkk.fp.RestaurantService.connect.GetRequest;

@Entity
@Table(name="restaurant")
public class Restaurant implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@JoinTable(name="list",
				joinColumns=@JoinColumn(name="id"),
				inverseJoinColumns=@JoinColumn(name="restaurant"))
	//private Menu menu;
	private Long id;
	private String nama;
	private String alamat;	
	private String promo;
	private String noTelp;
	private Float latitude;
	private Float longitude;
	//private GetRequest mapResto;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Float getLongitude() {
		return longitude;
	}
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	public Float getLatitude() {
		return latitude;
	}
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	public String getPromo() {
		return promo;
	}
	public void setPromo(String promo) {
		this.promo = promo;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getNoTelp() {
		return noTelp;
	}
	public void setNoTelp(String noTelp) {
		this.noTelp = noTelp;
	}
}
