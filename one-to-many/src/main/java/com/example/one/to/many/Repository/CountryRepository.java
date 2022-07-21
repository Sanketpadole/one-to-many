package com.example.one.to.many.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.one.to.many.Entity.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country,Integer>{

	Page<Country> findBycountryId(Pageable pageable,Class<Country>country1);
//	Page<Country>findByName(Pageable paging,Class<Country>country);
	Page<Country> findBycountryName(String search, Pageable pageable, Class<Country> country);


//	Optional<CountryRepository> findByIdAndIsActiveTrue(String id, Class<CountryRepository> countryRepository);
//
//
//	public static Optional<Country> findByIdAndIsActiveTrue(Class<CountryRepository> class1) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	static CountryDto findByIdAndIsActiveTrue(int id, Class<CountryDto> class1) {
//		// TODO Auto-generated method stub
//		return null;
//	}




}
