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

import com.example.one.to.many.Entity.City;
import com.example.one.to.many.Service.CityService;
@RestController
@RequestMapping(value = "/city")
public class CityController {
	@Autowired
	private CityService cityService;
	@GetMapping
	public List<City> city(){
		return cityService.city();
	}

	@GetMapping("/{id}")
	public List<City> country(@PathVariable int id){
		return cityService.city();
	}

	@PostMapping
	public City addcity(@RequestBody City city)
	{
		return cityService.addcity(city);
	}

	@PutMapping("/{id}")
	public City updatecity(@PathVariable int id,@RequestBody City city)
	{
		return cityService.updatecity(city);

	}
	  @DeleteMapping("/{id}")
	    public void deleteCategory(@PathVariable int id){
	        cityService.deleteCity(id);
	    }


}


