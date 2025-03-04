package structural.composite_03.exmaple_01.component;

import structural.composite_03.exmaple_01.FileSystemComponent;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {


    private final String name;
    private final List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: "+ name);
        components.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                ", components=" + components +
                '}';
    }
}
