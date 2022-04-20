package tools;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Vypis {
    public Vypis() {

    }
    public void WriteToFile(String[] Array){
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        for (String i:Array) {
            try {
                FileWriter myWriter = new FileWriter("filename.txt");
                myWriter.write(i);
                myWriter.close();
                System.out.println("uspesne");
            } catch (IOException e) {
                System.out.println("chyba");
                e.printStackTrace();
            }

        }
    }
}
