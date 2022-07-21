package com.example.one.to.many.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.one.to.many.Dto1.CountryDto;
import com.example.one.to.many.Entity.Country;
@Service
public interface CountryService {



	public List<Country> country();

	public CountryDto addcountry(CountryDto country);

	public Country updatecountry(Country country);

	void deleteCourse();

	public void deleteCountry(int id);
//
//	Country count();
//
//	CountryDto findById(int id);

	Country updatecountry(CountryDto country);






	public Country getCountry(int id);



	public Page<Country> getCountries(String search, String pageNumber, String pageSize);



}
