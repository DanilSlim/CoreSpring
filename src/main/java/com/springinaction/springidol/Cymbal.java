package com.springinaction.springidol;

import com.springinaction.springidol.qualifiers.StringedInstrument;
import com.springinaction.springidol.qualifiers.Strummed;

@StringedInstrument
@Strummed
public class Cymbal implements Instrument {

	@Override
	public void play() {
		System.out.println("BANG BANG BANG");

	}

}
