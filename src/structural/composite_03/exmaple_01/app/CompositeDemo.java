package structural.composite_03.exmaple_01.app;

import structural.composite_03.exmaple_01.FileSystemComponent;
import structural.composite_03.exmaple_01.component.File;
import structural.composite_03.exmaple_01.component.Folder;

public class CompositeDemo {
    public static void main(String[] args) {

        FileSystemComponent file1 = new File("Document.txt");
        FileSystemComponent file2 = new File("Photo.jpg");
        FileSystemComponent file3 = new File("Video.mp4");

//        Create folders
        Folder folder1 = new Folder("Downloads");
        Folder folder2 = new Folder("Movies");

//        Add files to folders
        folder1.addComponent(file1);
        folder1.addComponent(file2);
        folder2.addComponent(file3);

//        Create main directory
        Folder mainFolder = new Folder("My Files");
        mainFolder.addComponent(folder1);
        mainFolder.addComponent(folder2);

//        Display the entire structure
        mainFolder.showDetails();

    }
}
