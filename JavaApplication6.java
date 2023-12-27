/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Rebeca
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.printf("1) Author info\n2) Integer Operation\n3) Floating Point Operation\n0) Exit\n");
        int menuOption = input.nextInt();                     
        while(menuOption != 0)
        {
            switch(menuOption) 
            {
                case 1:
                    System.out.printf("Rebeca Oliveira de Souza\nCSU ID: 2863714\n");
                    break;
                case 2:
                    System.out.printf("Please write an integer equation below.\nYou can use addition, subtraction, multiplication, division and modulus.\nPlease follow this format: num1 op num2\n");
                    int num1 = input.nextInt();
                    char operator = input.next().charAt(0);
                    int num2 = input.nextInt();
                    int resultInt = 0;
                    switch(operator){
                        case '+':
                            resultInt = num1 + num2;
                            break;
                        case '-':
                            resultInt = num1 - num2;
                            break;
                        case 'X':
                        case '*':
                            resultInt = num1 * num2;
                            break;
                        case '/':
                            resultInt = num1 / num2;
                            break;
                        case '%':
                            resultInt = num1 % num2;
                            break;
                        default:
                            System.out.println("Invalid operator");
                            break;
                    }
                    System.out.printf("OUTPUT: %d %c %d = %d%n", num1, operator, num2, resultInt);
                    break;
                case 3:
                    System.out.printf("Please write a floating point equation below.\nYou can use addition, subtraction, multiplication and division.\nPlease follow this format: num1 op num2\n");
                    double num1f = input.nextDouble();
                    char operatorf = input.next().charAt(0);
                    double num2f = input.nextDouble();
                    double resultDouble = 0;
                    switch (operatorf){
                        case '+':
                            resultDouble = num1f + num2f;
                            break;
                        case '-':
                            resultDouble = num1f - num2f;
                            break;
                        case '*':
                        case 'X':
                            resultDouble = num1f * num2f;
                            break;
                        case '/':
                            resultDouble = num1f/num2f;
                            break;
                    }
                    System.out.printf("OUTPUT: %.2f %c %.2f = %.2f\n", num1f,operatorf,num2f,resultDouble);
                    break;
                default:
                    System.out.printf("This is an invalid selection.\nTry again!\n");
                    break;
            }
            System.out.printf("1) Author info\n2) Integer Operation\n3) Floating Point Operation\n0) Exit\n");
            menuOption = input.nextInt();//why does it reach this line and makes menuOption = 4???
            //line 42 and 43 got from https://stackoverflow.com/questions/61511937/how-to-loop-a-menu-continuously-until-exit-option-is-chosen-as-well-as-repeat-m
        }
    }
    
}
