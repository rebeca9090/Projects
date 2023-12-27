/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment.pkg6;

import java.util.IllegalFormatConversionException;
import java.util.Scanner;

/**
 *
 * @author fiske
 */
public class NewClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BadCode data = new BadCode();
        Scanner input = new Scanner(System.in);
        int sel;
        data.setAuthorInfo("Rebeca Oliveira de Souza 2863714");
        loop:
        while (true) {
            System.out.println("\n1) Get Author Info\n2) Insert data\n3) Calculate Division\n4) Get Message\n5) Print data\n6) Clear data\n0) Exit\n");
            sel = input.nextInt();

            switch (sel) {
                case 1 -> {
                    System.out.println(data.getAuthorInfo());
                }
                case 2 -> {
                    System.out.println("Enter an integer");
                    sel = input.nextInt();
                    try{
                    data.insert(sel);
                    }catch(ArrayIndexOutOfBoundsException e){
                        System.out.printf("The array doesn't have that index size\n");
                    }
                    
                }
                case 3 -> {
                    try{
                        System.out.printf("Result of division: %d\n", data.divide());
                    }catch(IllegalFormatConversionException e){
                        System.out.printf("A format conversion error ocurred\n");
                    }catch(ArrayIndexOutOfBoundsException e){
                        System.out.printf("The array doesn't have that index size\n");                   
                    }
                }
                case 4 -> {
                    try{
                        System.out.printf("Message: %s\nLength: %d\n", data.getMsg(), data.getLen());
                    }catch (ArrayIndexOutOfBoundsException e) {
                        System.out.printf("The array doesn't have that index size\n");                  
                    }catch(NullPointerException e){
                        System.out.printf("A NullPointer error ocurred\n");
                    }
                }
                case 5 -> {
                    try{
                    data.printData();
                    }catch(StackOverflowError e){
                        System.out.printf("\nA StackOverflow error ocurred\n");
                    }catch(ArrayIndexOutOfBoundsException e){
                        System.out.printf("The array doesn't have that index size\n");
                    }
                    
                }
                case 6 -> {
                    boolean repeat = true;
                    while(repeat){
                        try{
                            data.clearData();
                            repeat =false;
                        }catch(UnknownError e){
                            repeat = true;
                        }
                    }
                    
                }
                case 0 -> {
                    break loop;
                }
            }
        }
    }

}
