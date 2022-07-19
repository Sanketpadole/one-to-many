package com.example.one.to.many.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class City {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "cityId")
	

	private int cityId;
    private String cityName;
    private String cityCap;
    
    
//    private String countryId;
    
	public City(int cityId, String cityName, String cityCap, String countryId) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.cityCap = cityCap;
//		this.countryId = countryId;
	}
	
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityCap() {
		return cityCap;
	}
	public void setCityCap(String cityCap) {
		this.cityCap = cityCap;
	}
//	public String getCountryId() {
//		return countryId;
//	}
//	public void setCountryId(String countryId) {
//		this.countryId = countryId;
//	}
    

}
