package day_03.io;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {

    public static void main(String[] args) {
        //reference to the file
        Path p = Paths.get("catinthehat.txt");
        System.out.printf("toString:%s\n", p.toString());

        //get the file
        File f = p.toFile();

        //information on th file
        System.out.printf("get absolution path: %s\n", f.getAbsolutePath());
        System.out.printf("get name: %s\n", f.getName());
        System.out.printf("file size: %s\n", f.length());

        //Use file
        File cat = new File("src/day_03/io/Main.java");
        System.out.printf("get absolute path: %s \n",cat.getAbsolutePath());
        System.out.printf("get name: %s \n", cat.getName());
        System.out.printf("File size: %s \n", cat.length());
    }
}