import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandeling {
    public static void main(String[] args) {

        //Code to create a new file
        /*
        File myFile = new File("file1.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create file");
            throw new RuntimeException(e);
        }



        // Code to write into the file
        try {
            FileWriter fw = new FileWriter("file1.txt");
            fw.write("Hello World\nI am Anannya");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //Reading a file
        File myFile = new File("file1.txt");
        try {
            Scanner input = new Scanner(myFile);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



        File myFile = new File("file1.txt");
        if(myFile.delete()){
            System.out.println("File deleted successfully "+ myFile.getName());
        }
        else{
            System.out.println("File could not be deleted "+ myFile.getName());
        }

         */
    }
}
