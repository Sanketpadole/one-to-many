package com.example.one.to.many.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.one.to.many.Dto1.CountryDto;
import com.example.one.to.many.Entity.City;
import com.example.one.to.many.Entity.Country;
import com.example.one.to.many.Page.Pages;
import com.example.one.to.many.Repository.CityRepository;
import com.example.one.to.many.Repository.CountryRepository;
@Service
public class CountryServiceImpl implements CountryService {
//	private static final String id = null;
	@Autowired
	private CountryRepository countryRepository;
//	@Autowired
//	private CityService cityService;

	@Autowired
	private CityRepository cityRepository;

	@Override
	public Page<Country> getCountries(String search,String pageNumber,String pageSize)
	{

		Pageable pageable=new Pages().getPagination(pageNumber,pageSize);
		if((search=="") || (search==null)||(search.length()==0))
		{
			return countryRepository.findBycountryId(pageable,Country.class);
		}
		else
		{
			return countryRepository.findBycountryName(search,pageable,Country.class);
		}
		// TODO Auto-generated method stub


	}

//	@Override
//	public List<Country> countries(int id) {
//		// TODO Auto-generated method stub
//
//
//		return countryRepository.findById(id);
//	}

	@Override
	public CountryDto addcountry(CountryDto country) {
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
		return new CountryDto();
	}

	@Override
	public Country updatecountry(CountryDto country) {
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

		this.cityRepository.save(city123);
		return new Country();
//		return  countryRepository.save(country);
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
	public Country updatecountry(Country country) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Country getCountry(int id) {
		// TODO Auto-generated method stub
		return countryRepository.findById(id).get();

	}

	@Override
	public List<Country> country() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Page<Country> getAllCountry(String search, String from, String to) {
//		// TODO Auto-generated method stub
//		return null;
//	}



//	@Override
//
//	public CountryDto findById(int id) {
//
//
//		CountryDto langData = CountryRepository.findByIdAndIsActiveTrue(id, CountryDto.class);
//
//		return langData;
//
//
//	}
//
//	@Override
//	public Country count() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	}



