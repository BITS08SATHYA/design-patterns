package structural.facade_03.subsystems.Projector;

public class Projector {
    public void turnOn(){
        System.out.println("Projector is turning on");
    }

    public void setInputSource(String inputSource){
        System.out.println("Project Input set to: " + inputSource);
    }

    public void turnOff(){
        System.out.println("Projector is turning off");
    }
}
