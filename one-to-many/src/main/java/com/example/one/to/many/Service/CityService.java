package com.example.one.to.many.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.one.to.many.Entity.City;

@Service
public interface CityService {
	

	public List<City> city();

	public City addcity(City city);

	public City updatecity(City city);

	void deleteCourse();

	void deleteCity();

	public void deleteCity(int id);

}


