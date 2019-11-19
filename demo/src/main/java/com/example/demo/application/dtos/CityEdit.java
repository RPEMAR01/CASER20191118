package com.example.demo.application.dtos;

import com.example.demo.domains.entities.City;
import com.example.demo.domains.entities.Country;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class CityEdit {
	private int cityId;
	private String city;
	private int countryId;
	
	public static CityEdit from(City source) {
		return new CityEdit(
					source.getCityId(),
					source.getCity(),
					source.getCountry().getCountryId()
				);
	}
	public static City from(CityEdit source) {
		return new City(
					source.getCityId(),
					source.getCity(),
					new Country(source.getCountryId())
				);
		
	}
}
