package chapter7.facadePattern.facade;

import chapter7.facadePattern.subsystem.Amplifier;
import chapter7.facadePattern.subsystem.CdPlayer;
import chapter7.facadePattern.subsystem.DvdPlayer;
import chapter7.facadePattern.subsystem.PopcornPopper;
import chapter7.facadePattern.subsystem.Projector;
import chapter7.facadePattern.subsystem.Screen;
import chapter7.facadePattern.subsystem.TheaterLights;
import chapter7.facadePattern.subsystem.Tuner;

public class HomeTheaterFacade {
	Amplifier amp;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;
	
	public HomeTheaterFacade(Amplifier amp,
			Tuner tuner,
			DvdPlayer dvd,
			CdPlayer cd,
			Projector projector,
			Screen screen,
			TheaterLights lights,
			PopcornPopper popper) {
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.screen = screen;
		this.lights = lights;
		this.popper = popper;
	}
	
	// 기타 메소드
	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie ...");
		popper.on();
		popper.pop();
		lights.dim();
		screen.down();
		// ...
		
		
	}

	public void endMovie() {
		// TODO Auto-generated method stub
		
	}
}
