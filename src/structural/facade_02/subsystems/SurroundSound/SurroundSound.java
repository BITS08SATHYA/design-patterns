package structural.facade_02.subsystems.SurroundSound;

public class SurroundSound {

    public void turnOn(){
        System.out.println("Projector is turned on");
    }

    public void setVolume(int level){
        System.out.println("Surround Sound volume set to " + level);
    }

    public void turnOff(){
        System.out.println("Projector is turned off");
    }
}
