/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kennedibullard
 */
public class StringProcessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        readFile(args[0]);
        // TODO code application logic here
    }

    public static String[] readFile(String filename) {
        String[] records = new String[100];
        int currentIndex = 0;

        try {
            Scanner reader = new Scanner(new File(filename));
            while (reader.hasNext()) {
                String[] line = reader.nextLine().split(",");

                String firstName = line[0];
                String lastName = line[1];
                String age = line[2];
                String gender = line[3];
                String phoneNum = line[4];
                String email = line[5];

                records[currentIndex] = String.format("%-20s%-20s%-10s%20s%-20s%-20s", firstName, lastName, age, gender, phoneNum, email);
                System.out.println(records[currentIndex]);
                currentIndex++;
            }

        } catch (FileNotFoundException ex) {
            System.err.print("Cannot find file");
            System.exit(-1);
        }
        return records;

    }
    
   

}
