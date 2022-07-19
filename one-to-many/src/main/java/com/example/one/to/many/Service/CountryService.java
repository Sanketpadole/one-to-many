package com.example.one.to.many.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.one.to.many.Entity.Country;
@Service
public interface CountryService {

	

	public List<Country> country();

	public Country addcountry(Country country);

	public Country updatecountry(Country country);

}
