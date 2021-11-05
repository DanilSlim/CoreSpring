package com.habuma.spel.cities;

import java.util.List;

public class CityViewer implements ViewCities {

	private List<City>cities;
	
	private List<City>bigCities;
	
	
	
	public List<City> getBigCities() {
		return bigCities;
	}



	public void setBigCities(List<City> bigCities) {
		this.bigCities = bigCities;
	}



	
	
	
	
	public List<City> getCities() {
		return cities;
	}



	public void setCities(List<City> cities) {
		this.cities = cities;
	}



	@Override
	public void viewCities() {
		
		for(City city:cities) {
			System.out.println("City: "+city.getName()+" State: "+city.getState()+" Pupulation: "+city.getPopulation());
		}
		
		System.out.println();
		System.out.println("Big cities");
		
		for(City bigCity:bigCities) {
			
			System.out.println("City: "+bigCity.getName()+" State: "+bigCity.getState()+" Pupulation: "+bigCity.getPopulation());
		}
		

	}

}
