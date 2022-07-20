package com.example.one.to.many.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.one.to.many.Dto1.CountryDto;
import com.example.one.to.many.Entity.City;
import com.example.one.to.many.Entity.Country;
import com.example.one.to.many.Repository.CityRepository;
import com.example.one.to.many.Repository.CountryRepository;
@Service
public class CountryServiceImpl implements CountryService {
	private static final String id = null;
	@Autowired
	private CountryRepository countryRepository;
//	@Autowired
//	private CityService cityService;
	
	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<Country> country() {
		// TODO Auto-generated method stub
		
		return countryRepository.findAll();
	}

	@Override
	public Country addcountry(CountryDto country) {
		// TODO Auto-generated method stub
		
		Country temp = new Country();
		temp.setCountryName(country.getCountryName());
		temp.setCountryCap(country.getCountryCap());
		
		Country country123 =  countryRepository.save(temp);
		System.out.println(country123);

		City city123 = new City();
		city123.setCityName(country.getCityName());
		city123.setCityCap(country.getCityCap());
		city123.setCountryId(country123.getCountryId());
		
		cityRepository.save(city123);
		return new Country();
	}

	@Override
	public Country updatecountry(Country country) {
		// TODO Auto-generated method stub
		return  countryRepository.save(country);
	}
	
	@Override
	public void deleteCourse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	
		// TODO Auto-generated method stub
		 public void deleteCountry(int id){
		        countryRepository.deleteById(id);
		    }
	
	@Override

	public CountryDto findById(int id) {


		CountryDto langData = CountryRepository.findByIdAndIsActiveTrue(id, CountryDto.class);

		return langData;


	}

	@Override
	public Country count() {
		// TODO Auto-generated method stub
		return null;
	}

	}



