package com.example.one.to.many.Repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.one.to.many.Dto1.CountryDto;
import com.example.one.to.many.Entity.Country;
import com.example.one.to.many.Service.CityService;
import com.example.one.to.many.Service.CityServiceImpl;
@Repository
public interface CountryRepository extends JpaRepository<Country,Integer>{
	Optional<CountryRepository> findByIdAndIsActiveTrue(String id, Class<CountryRepository> countryRepository);


	public static Optional<Country> findByIdAndIsActiveTrue(Class<CountryRepository> class1) {
		// TODO Auto-generated method stub
		return null;
	}


	static CountryDto findByIdAndIsActiveTrue(int id, Class<CountryDto> class1) {
		// TODO Auto-generated method stub
		return null;
	}

}
