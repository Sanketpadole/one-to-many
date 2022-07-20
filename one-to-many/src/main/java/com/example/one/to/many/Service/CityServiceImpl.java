package com.example.one.to.many.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.one.to.many.Entity.City;
import com.example.one.to.many.Entity.Country;
import com.example.one.to.many.Repository.CityRepository;
import com.example.one.to.many.Repository.CountryRepository;
@Service
public class CityServiceImpl implements CityService{
	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<City> city() {
		// TODO Auto-generated method stub
		return cityRepository.findAll();
	}

	@Override
	public City addcity(City city) {
		// TODO Auto-generated method stub
		return  cityRepository.save(city);
	}

	@Override
	public City updatecity(City city) {
		// TODO Auto-generated method stub
		return  cityRepository.save(city);
	}
	
	@Override
	public void deleteCity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCourse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	 public void deleteCity(int id){
        cityRepository.deleteById(id);
    }


//	@Override
//	public City addcity(City city) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	

}


