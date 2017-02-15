package chapter7.facadePattern;

import chapter7.facadePattern.facade.HomeTheaterFacade;
import chapter7.facadePattern.subsystem.Amplifier;
import chapter7.facadePattern.subsystem.CdPlayer;
import chapter7.facadePattern.subsystem.DvdPlayer;
import chapter7.facadePattern.subsystem.PopcornPopper;
import chapter7.facadePattern.subsystem.Projector;
import chapter7.facadePattern.subsystem.Screen;
import chapter7.facadePattern.subsystem.TheaterLights;
import chapter7.facadePattern.subsystem.Tuner;

public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier();
		Tuner tuner = new Tuner();
		DvdPlayer dvd = new DvdPlayer();
		CdPlayer cd = new CdPlayer();
		Projector projector = new Projector();
		TheaterLights lights = new TheaterLights();
		Screen screen = new Screen();
		PopcornPopper popper = new PopcornPopper();
		
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
		
	}
}
