/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment.pkg4;
import java.util.*;
import java.lang.Math;

/**
 *
 * @author reolivei
 */
public class Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        ArrayList<TypeA> typeAs = new ArrayList<>();
        ArrayList<TypeB> typeBs = new ArrayList<>();
        System.out.printf("1) Author info\n2) Enter TypeA\n3) Enter TypeB\n4) Print Data\n5) Type A, B Operation\n"
                + "6) Type B, A Operation\n7) Type A, A Operation\n8) Type B, B Operation\n9) Clear Data\n0) Exit\n");
        int menuOption = input.nextInt();        
        while(menuOption != 0)
        {
            switch (menuOption)
            {
                case 1:
                    System.out.printf("Rebeca Oliveira de Souza\n2863714\n");
                    break;
                case 2:
                    System.out.printf("Enter 2 integers\n");
                    int val1= input.nextInt();
                    int val2= input.nextInt();
                    TypeA typeA = new TypeA(val1, val2);
                    //System.out.printf("Type A has a sum value of %d\n",typeA.getValue());
                    typeAs.add(typeA);
                    break;

                case 3:
                    System.out.printf("Enter 3 integers\n");
                    int valB1 = input.nextInt();
                    int valB2 = input.nextInt();
                    int valB3 = input.nextInt();
                    TypeB typeB = new TypeB(valB1, valB2, valB3);
                    typeBs.add(typeB);
                    break;

                case 4:
                    for (int i = 0; i < typeAs.size(); i++) {
                        System.out.println(typeAs.get(i));
                    }
                    for (int i = 0; i < typeBs.size(); i++) {
                        System.out.println(typeBs.get(i));
                    }
                    break;
                    
                case 5:
                    for (int i = 0; i < typeAs.size(); i++) {
                        System.out.println(i+")"+typeAs.get(i));
                    }
                    System.out.printf("Index for Type A\n");
                    int indexA = input.nextInt();
                    for (int i = 0; i < typeBs.size(); i++) {
                        System.out.println(i + ")" +typeBs.get(i));
                    }
                    System.out.printf("Index for Type B\n");
                    int indexB = input.nextInt();
                    TypeA selectedTypeA = typeAs.get(indexA);
                    TypeB selectedTypeB = typeBs.get(indexB);
                    int result = selectedTypeA.performOperation(selectedTypeB);
                    System.out.println("Result: " + result);
                    break;

                case 6:
                    for (int i = 0; i < typeBs.size(); i++) {
                        System.out.println(i + ")" +typeBs.get(i));
                    }
                    System.out.print("Enter the index of TypeB: \n");
                    int typeBIndex2 = input.nextInt();
                    for (int i = 0; i < typeAs.size(); i++) {
                        System.out.println(i + ")" + typeAs.get(i));
                    }
                    System.out.print("Enter the index of TypeA: \n");
                    int typeAIndex2 = input.nextInt();
                    TypeB selectedTypeB2 = typeBs.get(typeBIndex2);
                    TypeA selectedTypeA2 = typeAs.get(typeAIndex2);
                    TypeA resultTypeA2 = selectedTypeB2.performOperation(selectedTypeA2);
                    System.out.println("Result: " + resultTypeA2);
                    break;

                case 7:
                    for (int i = 0; i < typeAs.size(); i++) {
                        System.out.println(i + ")" + typeAs.get(i));
                    }
                    System.out.print("Enter the index of TypeA: \n");
                    int typeAIndex3 = input.nextInt();
                    for (int i = 0; i < typeAs.size(); i++) {
                        System.out.println(i + ")" + typeAs.get(i));
                    }
                    System.out.print("Enter another index of TypeA: \n");
                    int anotherTypeAIndex = input.nextInt();
                    TypeA selectedTypeA3 = typeAs.get(typeAIndex3);
                    TypeA anotherTypeA = typeAs.get(anotherTypeAIndex);
                    int result2 = selectedTypeA3.performOperation(anotherTypeA);
                    System.out.println("Result: " + result2);
                    break;
                case 8:
                    for (int i = 0; i < typeBs.size(); i++) {
                        System.out.println(i + ")" + typeBs.get(i));
                    }
                    System.out.print("Enter the index of TypeB: \n");
                    int typeBIndex3 = input.nextInt();
                    for (int i = 0; i < typeBs.size(); i++) {
                        System.out.println(i + ")" +typeBs.get(i));
                    }
                    System.out.print("Enter another index of TypeB: \n");
                    int anotherTypeBIndex = input.nextInt();
                    TypeB selectedTypeB3 = typeBs.get(typeBIndex3);
                    TypeB anotherTypeB = typeBs.get(anotherTypeBIndex);
                    TypeA resultTypeA3 = selectedTypeB3.performOperation(anotherTypeB);
                    System.out.println("Result: " + resultTypeA3);
                    break;
                case 9:
                    typeAs.clear();
                    typeBs.clear();
                    System.out.println("Data cleared.");
                    break;
                default:
                    System.out.printf("Invalid Number, choose again");
            }
            System.out.printf("1) Author info\n2) Enter TypeA\n3) Enter TypeB\n4) Print Data\n5) Type A, B Operation\n"
                    + "6) Type B, A Operation\n7) Type A, A Operation\n8) Type B, B Operation\n9) Clear Data\n0) Exit\n");
            menuOption = input.nextInt();
        }

    }
    
}
