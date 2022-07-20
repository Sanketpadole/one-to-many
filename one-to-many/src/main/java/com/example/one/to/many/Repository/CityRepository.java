package com.example.one.to.many.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.one.to.many.Entity.City;
import com.example.one.to.many.Service.CountryService;
import com.example.one.to.many.Service.CountryServiceImpl;
@Repository
public interface CityRepository extends JpaRepository<City,Integer>{
	

}
