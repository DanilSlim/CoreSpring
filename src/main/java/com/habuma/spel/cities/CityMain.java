package com.habuma.spel.cities;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CityMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("appContext.xml");
		
		ViewCities viewCities=(ViewCities) context.getBean("cityViewer");
		
		viewCities.viewCities();

	}

}
