package creational.singleton_01;

public class Singleton_App {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);

        System.out.println(s1 == s2);
    }
}
