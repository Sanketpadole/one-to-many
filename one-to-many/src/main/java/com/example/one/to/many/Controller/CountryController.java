package com.example.one.to.many.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public ResponseEntity<?> getCountries(
			@RequestParam(defaultValue="")String search,
			@RequestParam(defaultValue="1")String pageNumber,
			@RequestParam(defaultValue="5")String pageSize)
	{
		System.out.println("page1");
		Page<Country> country=countryService.getCountries(search,pageNumber,pageSize);
		System.out.println("page2");
		if(country.getTotalElements()!=0) {
			System.out.println(country.getTotalElements());
			return new ResponseEntity<>(country.getContent(),HttpStatus.OK);
		}
		return new ResponseEntity<>("fail",HttpStatus.BAD_REQUEST);




	}


	  @GetMapping("/{Id}")
	    public Country getCountry(@PathVariable int Id){
	        return countryService.getCountry(Id);
	    }

	@PostMapping
	public CountryDto addcountry(@RequestBody CountryDto country)
	{
		return this.countryService.addcountry(country);
	}

	@PutMapping("/{id}")
	public Country updatecountry(@PathVariable int id,@RequestBody CountryDto country)
	{
		return this.countryService.updatecountry(country);

	}
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable int id){
        countryService.deleteCountry(id);
    }
}




