package structural.composite_03.exmaple_01.component;

import structural.composite_03.exmaple_01.FileSystemComponent;

public class File implements FileSystemComponent {

    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                '}';
    }
}
