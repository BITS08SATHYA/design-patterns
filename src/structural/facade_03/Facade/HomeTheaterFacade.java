package structural.facade_03.Facade;

import structural.facade_03.subsystems.DVDPlayer.DVDPlayer;
import structural.facade_03.subsystems.Lights.Lights;
import structural.facade_03.subsystems.Projector.Projector;
import structural.facade_03.subsystems.SurroundSound.SurroundSound;

import java.util.List;

public class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SurroundSound surroundSound;
    private Lights lights;

    public HomeTheaterFacade() {
        this.dvdPlayer = new DVDPlayer();
        this.projector = new Projector();
        this.surroundSound = new SurroundSound();
        this.lights = new Lights();
    }

    public void watchMovie(String movie){
        System.out.println("\nGetting ready to watch a movie:");
        lights.dim();
        projector.turnOn();
        projector.setInputSource("DVD Player");
        surroundSound.turnOn();
        surroundSound.setVolume(7);
        dvdPlayer.turnOn();
        dvdPlayer.playMovie(movie);
    }

    public void stopMovie(){
        System.out.println("\nGetting ready to stop movie:");
        dvdPlayer.turnOff();
        surroundSound.turnOff();
        projector.turnOff();
        lights.brighten();
    }
}
