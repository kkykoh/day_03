package day_03.io;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IOMain {

    public static void main(String[] args)
    //musthave this 
    //  check exception

        throws FileNotFoundException, IOException {
        File file = new File(args[0]);

        //throws an exception

        InputStream fis = new FileInputStream(file);
        
        //DataInputStream dis = new DataInputStream(fis);
        DataInputStream ois = new DataInputStream(fis);
        //ObjectInputStream ois = new ObjectInputStream(fis);

        // while (true) {
        //     String line = dis.readLine();
        //     System.out.printf(">>>line %s \n", line);
        //     if (null == line)
        //         break;

        int totalWords = 0;

        while (true) {
            String line = ois.readLine();
            
            if (null == line)
               break;
            System.out.printf(">>>line %s \n", line.toUpperCase());
        

            String[] words = line.split(" ");
            totalWords += words.length;
        }
        
        System.out.printf("total word count: %s \n.", totalWords.length);


        // //create a buffer
        // byte[] buffer = new byte[1024];

        // //read the file
        // int bytesRead = 0;
        // int total = 0;

        // while (bytesRead >= 0) {
        //     bytesRead = is.read(buffer);
        // }

        // while ((bytesRead = is.read(buffer)) >= 0) {
        //     bytesRead = is.read(buffer);
        //     if(bytesRead >= 0)
        //         total += bytesRead;
        //     System.out.printf(">>> bytes read>: %d (%d) \n", bytesRead, total);


            
        //after reading, close the stream
    fis.close();
    }
    
}
