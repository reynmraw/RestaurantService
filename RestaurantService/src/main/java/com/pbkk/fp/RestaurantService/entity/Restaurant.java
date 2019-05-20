package com.pbkk.fp.RestaurantService.entity;

import java.io.Serializable;
//import com.pbkk.fp.RestaurantService.connect.GetRequest;
//import com.pbkk.fp.RestaurantService.connect.GetRequest;
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
	private String promo;
	private Float latitude;
	private Float longitude;
	//private GetRequest idresto;
	
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
	/*public GetRequest getGetRequest() {
		return idresto;
	}*/
	
}
