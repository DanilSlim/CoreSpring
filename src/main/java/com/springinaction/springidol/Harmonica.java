package com.springinaction.springidol;

import com.springinaction.springidol.qualifiers.StringedInstrument;

@StringedInstrument
public class Harmonica implements Instrument {

	@Override
	public void play() {
		System.out.println("PIU PIU PIU");

	}

}
