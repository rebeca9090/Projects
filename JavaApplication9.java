/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Rebeca
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File names = new File("names.txt");
        Scanner scanner = new Scanner(names);
        //String input = scanner.next();
        //FileReader filer = new FileReader(input);
        while (scanner.hasNextLine()){
            String data;
            data = scanner.nextLine();
            System.out.println(data);
        }
        scanner.close();
            //FileWriter filew = new FileWriter(input);
        
        
    }
    
}
