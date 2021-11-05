package com.springinaction.springidol;

public class Saxophone implements Instrument {
	
	//Конструктор по умолчанию для bean явно можно не задавать

	@Override
	public void play() {
		System.out.println("TOOT  TOOT  TOOT");

	}

}
