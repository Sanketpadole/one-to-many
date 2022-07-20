package com.example.one.to.many.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.one.to.many.Dto1.CountryDto;
import com.example.one.to.many.Entity.Country;
@Service
public interface CountryService {

	

	public List<Country> country();

	public Country addcountry(CountryDto country);

	public Country updatecountry(Country country);

	void deleteCourse();

	public void deleteCountry(int id);

	Country count();

	CountryDto findById(int id);

}
