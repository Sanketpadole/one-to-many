package com.example.one.to.many.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.one.to.many.Entity.Country;
import com.example.one.to.many.Repository.CountryRepository;
@Service
public class CountryServiceImpl implements CountryService {
	@Autowired
	private CountryRepository countryRepository;

	@Override
	public List<Country> country() {
		// TODO Auto-generated method stub
		return countryRepository.findAll();
	}

	@Override
	public Country addcountry(Country country) {
		// TODO Auto-generated method stub
		return  countryRepository.save(country);
	}

	@Override
	public Country updatecountry(Country country) {
		// TODO Auto-generated method stub
		return  countryRepository.save(country);
	}

}
