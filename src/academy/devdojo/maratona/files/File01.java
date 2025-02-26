package academy.devdojo.maratona.files;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class File01 {
    //File - com arquivo em si
    //FileWriter - low level
    //FileReader -
    //BufferedWriter - Performace melhor
    //BufferedReader


    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        if (file.exists()) System.out.println("deleted: " + file.delete());

        System.out.println("Absolute Path: " + file.getAbsoluteFile());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Is File: " + file.isFile());
        System.out.println("Can read: " + file.canRead());
        System.out.println("Last modified " + new Date(file.lastModified()));
    }

}
