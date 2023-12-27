/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author Rebeca
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.printf("1) Author info\n2) Integer Operation\n3) Floating Point Operation\n0) Exit\n");
            int menuOption = input.nextInt();
            input.nextLine(); // Consume the newline character

            switch (menuOption) {
                case 1:
                    System.out.printf("Rebeca Oliveira de Souza\nCSU ID: 2863714\n");
                    break;
                case 2:
                    System.out.printf("Please write an integer equation below.\nYou can use addition, subtraction, multiplication, division, and modulus.\nPlease follow this format: num1 op num2\n");
                    String equationInt = input.nextLine();
                    String[] tokens = equationInt.split("\\s+");
                    System.out.printf(Arrays.toString(tokens)+"\n");
                    // Process the integer equation here
                    break;
                case 3:
                    System.out.printf("Please write a floating point equation below.\nYou can use addition, subtraction, multiplication, and division.\nPlease follow this format: num1 op num2\n");
                    float equationFloat = input.nextFloat();
                    input.nextLine(); // Consume the newline character
                    // Process the floating-point equation here
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.printf("This is an invalid selection.\nTry again!\n");
                    break;
            }
        }
    
    }
    
}
