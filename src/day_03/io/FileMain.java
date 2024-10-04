package day_03.io;

import java.io.File;
import java.io.file.Path;
import java.nio.file.Paths;

public class FileMain {

    public static void main(String[] args) {
        
        System.out.printf("args.length =%d\n", args.length);

        if (args.length <= 0) {
            System.err.println("Please provide a file name");
            //number 0 means good
            // any number other than 0 means bad, exit
            System.exit(1);
        }
        // loop through all the files and print their info
        for (String a:args) {
            System.out.printf(">>> Procesing %s\n", a);
            // path allows you to point to a file
            // file means that it is that exact file
            // if you have subdirectories, path allows you to ask is this file in this file
            // whats the difference between path and paths?

            //Path p = Paths.get(a);
            //File file = p.toFile();
            File file = new File(a);
            System.out.printf("path:%s\n", file.getAbsolutePath());
            System.out.printf("is file:%s\n", file.isFile());
            System.out.printf("exists:%s\n", file.exists());
            System.out.printf("write:%s\n", file.canWrite());
        }
    }
    
}