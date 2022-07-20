package com.example.one.to.many.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.one.to.many.Dto1.CountryDto;
import com.example.one.to.many.Entity.Country;
import com.example.one.to.many.Service.CountryService;
@RestController
@RequestMapping(value = "/country")
public class CountryController {
	@Autowired
	private CountryService countryService;
	@GetMapping
	public List<Country> country(){
		return countryService.country();
	}
	@GetMapping ("/{id}")
	public List<Country> country(@PathVariable int id){
		return countryService.country();
	}
		
	@PostMapping
	public Country addcountry(@RequestBody CountryDto country)
	{
		return countryService.addcountry(country);
	}
	
	@PutMapping("/{id}")
	public Country updatecountry(@PathVariable int id,@RequestBody Country country)
	{
		return countryService.updatecountry(country);
		
	}
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable int id){
        countryService.deleteCountry(id);
    }
}




