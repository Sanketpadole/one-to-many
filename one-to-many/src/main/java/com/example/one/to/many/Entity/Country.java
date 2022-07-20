package com.example.one.to.many.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Country {
	   @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	   @Column(name = "countryId")
	
	private int countryId;
    private String countryName;
    private String countryCap;
    private Boolean isActive;
    
    public Country(int countryId, String countryName, String countryCap, Boolean isActive, List<City> city) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.countryCap = countryCap;
		this.isActive = isActive;
		this.city = city;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "CountryId",referencedColumnName = "countryId")  
  private List<City> city;
    
	public Country(int countryId, String countryName, String countryCap) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.countryCap = countryCap;
	}
	
	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCap() {
		return countryCap;
	}

	public void setCountryCap(String countryCap) {
		this.countryCap = countryCap;
	}

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", countryCap=" + countryCap
				+ ", isActive=" + isActive + ", city=" + city + "]";
	}
	

}
