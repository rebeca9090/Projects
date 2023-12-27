/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment.pkg3;

import java.util.*;
import java.lang.Math;


/**
 *
 * @author reolivei
 */
public class Assignment3 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.printf("1) Author info\n2) Enter Integer\n3) Enter Floating Point\n4) Clear Data\n5) Print Sum\n"
                + "6) Print Average\n7) Print History\n8) Print Reverse History\n0) Exit\n");
        int menuOption = input.nextInt();
        int[] arrInt = new int[100];
        int countInt = 0;
        ArrayList<Double> arrF = new ArrayList<>();
        int sumInt = 0;
        double sumF = 0;
        double sumTotal =0;
        double avg = 0;
        while (menuOption != 0) 
        {
            
            switch (menuOption) 
            {
                case 1:
                    System.out.printf("Rebeca Oliveira de Souza\nCSU ID: 2863714\n");
                    break;
                case 2:
                    System.out.printf("Please enter an integer\n");
                    int userInt = input.nextInt();
                    arrInt[countInt] = userInt;
                    countInt++;
                    break;
                case 3:
                    System.out.printf("Please enter a floating point number\n");
                    double userF = input.nextDouble();
                    arrF.add(userF);       
                    break;
                case 4:
                    Arrays.fill(arrInt, 0);
                    arrF.clear();
                    break;
                case 5:
                    for (int i = 0; arrInt[i]!=0;i++){
                        sumInt += arrInt[i];
                    }
                    for(double num : arrF){
                        sumF += num;
                    }
                    sumTotal = sumInt + sumF;
                    System.out.printf("The sum of all entered values are: %.3f\n", sumTotal);
                    break;
                case 6:
                    avg = sumTotal / (countInt + arrF.size());
                    System.out.printf("The average of both the array and the arrayList is: %f\n", avg);
                    break;
                case 7:
                    System.out.printf("The integers entered are as follow: ");
                    for (int i = 0; i<arrInt.length && arrInt[i]!=0;i++){
                        System.out.printf("%d ", arrInt[i]);
                    }
                    System.out.println();
                    System.out.printf("The floating point numbers entered are as follow: ");
                    for(double count : arrF){
                        System.out.printf("%.3f ", count);
                    }
                    System.out.println();
                    break;
                case 8:
                    System.out.printf("The most recent integers entered are as follow: ");
                    for (int i = countInt -1;i>=0;i--){
                        System.out.printf("%d ", arrInt[i]);
                    }
                    System.out.println();
                    System.out.printf("The most recent floating point numbers entered are as follow: ");
                    for (int i = arrF.size() -1;i>=0;i--){
                        System.out.printf("%.3f ", arrF.get(i));
                    }
                    System.out.println();

                    break;
                default:
                    System.out.printf("This is an invalid selection.\nTry again!\n");
                    break;
            }
            System.out.printf("1) Author info\n2) Enter Integer\n3) Enter Floating Point\n4) Clear Data\n5) Print Sum\n"
                    + "6) Print Average\n7) Print History\n8) Print Reverse History\n0) Exit\n");
            menuOption = input.nextInt();
        }
    } 
}