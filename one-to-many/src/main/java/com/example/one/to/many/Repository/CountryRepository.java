package com.example.one.to.many.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.one.to.many.Entity.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country,Integer>{

}
