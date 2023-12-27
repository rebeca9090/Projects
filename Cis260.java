package cis260;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fiske
 */
public class Cis260 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        ArrayList<Integer> ints = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();
        FileWriter logfile = new FileWriter("cis_260_files.log", true);
        ArrayList<MathOperation> operations = new ArrayList<>();
        while (true) {
            System.out.println("1) Author info\n2) Add operation\n3) Print operations\n4) Clear Operations\n5) Save Data\n6) Load Data\n0) Exit\n");
            int sel = input.nextInt();
            if (sel == 0) {
                break;
            } else if (sel == 1) {
                System.out.println("Rebeca Oliveira de Souza\n2863714\n");
            } else if (sel == 2) {
                System.out.println("1) Addition\n2) 3 Value Sum\n3) Division\n4) Greater or Equal\n5) Greater than\n6) Less or Equal\n7) Less Than\n8) Mod\n9) Multiplication\n10 Subtract\n0) Cancel");
                sel = input.nextInt();
                if (sel == 0) {
                    continue;
                } else if (sel == 1) {
                    //operations.add(new AdditionOperation(input));
                    int a = input.nextInt();
                    int b = input.nextInt();
                    operations.add(new AdditionOperation(a,b));
                } else if (sel == 2) {
                    operations.add(new AdditionOperation3(input));
                } else if (sel == 3) {
                    operations.add(new DivisionOperation(input));
                    System.out.println("Placeholder");
                } else if (sel == 4) {
                    
                    System.out.println("Write your 2 ints");
                    int num1 = inputInt.nextInt();
                    int num2 = inputInt.nextInt();
                    operations.add(new GreaterEqualOperation(num1,num2));
                    System.out.println("Placeholder");
                } else if (sel == 5) {
                    System.out.println("Placeholder");
                } else if (sel == 6) {
                    System.out.println("Placeholder");
                } else if (sel == 7) {
                    System.out.println("Placeholder");
                } else if (sel == 8) {
                    System.out.println("Placeholder");
                } else if (sel == 9) {
                    System.out.println("Placeholder");
                } else if (sel == 10) {
                    System.out.println("Placeholder");
                }
            } else if (sel == 3) {
                System.out.println("Operations: ");
                for (MathOperation curOp : operations) {
                    System.out.println(curOp.toString());
                }
            } else if (sel == 4) {
                operations.clear();
            } else if (sel == 5) {
                System.out.println("How would you like to name this file?");
                String n = input.next();
                FileWriter saveD = new FileWriter(n);
                for (int i = 0; i < operations.size(); i++) {
                    saveD.write(operations.get(i).toString());
                    saveD.write("\n");
                }
                saveD.close();
                System.out.println("The items were added to the file");

            } else if (sel == 6) {
                System.out.println("What file would you like to load?");
                String n = input.next();
                File myObj = new File(n);
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                System.out.println("\nWe reached the end of that file");
            } else {
                System.out.println("Invalid selection");
            }

        }
    }
}
