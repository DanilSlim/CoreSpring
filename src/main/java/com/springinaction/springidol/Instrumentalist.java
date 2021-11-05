package com.springinaction.springidol;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.springinaction.springidol.qualifiers.StringedInstrument;
import com.springinaction.springidol.qualifiers.Strummed;

public class Instrumentalist implements Performer {
	
	private String song;
	
	//@Autowired
	//@StringedInstrument //Custom qualificator
	//@Strummed //второй кстомный квалификатор сужающий область поиска бина кандидата
	private Instrument instrument;
	

	public Instrumentalist(){
	}

	@Override
	public void perform() {
		System.out.print("Playing "+song + " : ");
		instrument.play();

	}
	
	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}
	
	public String screamSong(){
		return song;
		}
	
	@Autowired
	//@StringedInstrument
	//@Strummed
	@Qualifier("piano") //квалификатор по ID бина
	public void setInstrument(Instrument instrument){
		this.instrument=instrument;
		}

}
