package structural.facade_02.subsystems.DVDPlayer;

public class DVDPlayer {

    public void turnOn(){
        System.out.println("DVDPlayer turned on");
    }

    public void playMovie(String movie){
        System.out.println("Playing movie " + movie);
    }

    public void turnOff(){
        System.out.println("DVDPlayer turned off");
    }
}
