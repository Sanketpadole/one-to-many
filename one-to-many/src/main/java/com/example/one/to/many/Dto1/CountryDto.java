package com.example.one.to.many.Dto1;

public class CountryDto {


	private String cityName;
    private String cityCap;
    private String countryName;
    private String countryCap;

	public CountryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CountryDto(String cityName, String cityCap, String countryName, String countryCap) {
		super();
		this.cityName = cityName;
		this.cityCap = cityCap;
		this.countryName = countryName;
		this.countryCap = countryCap;
	}
	@Override
	public String toString() {
		return "CountryDto [cityName=" + cityName + ", cityCap=" + cityCap + ", countryName=" + countryName
				+ ", countryCap=" + countryCap + "]";
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


}



