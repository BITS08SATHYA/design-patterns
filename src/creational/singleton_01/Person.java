package creational.singleton_01;

public class Person implements Cloneable {

    public static int roll_count;
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        roll_count++;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display(){
        System.out.println("Name: " + name + ", Age: " + age + ", Roll ID: " + roll_count);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Person original = new Person(25, "Adi");
        System.out.println("Original Object:");
        original.display();

        System.out.println("Cloned Object: ");
        Person cloned = (Person) original.clone();
        cloned.display();

        System.out.println("Are both objects different? " + (original != cloned));
        System.out.println("Do they have same data? " + original.equals(cloned));

        System.out.println(original);
        System.out.println(cloned);
    }

}
