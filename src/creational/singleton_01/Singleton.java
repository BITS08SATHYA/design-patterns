package creational.singleton_01;

public class Singleton {

    private static Singleton instance;

//    private constructor to prevent instantiation from other classes
    private Singleton(){
        System.out.println("Singleton instance created");
    }

//    public method to provide access to the global instance
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
