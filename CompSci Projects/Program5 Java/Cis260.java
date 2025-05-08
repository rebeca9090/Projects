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
        FileWriter logfile = new FileWriter("cis_260_files.log", true);
        ArrayList<MathOperation> operations = new ArrayList<>();
        
        OUTER:
        while (true) {
            System.out.println("1) Author info\n2) Add operation\n3) Print operations\n4) Clear Operations\n5) Save Data\n6) Load Data\n0) Exit\n");
            int sel = input.nextInt();
            switch (sel) {
                case 0:
                    break OUTER;
                case 1:
                    System.out.println("Rebeca Oliveira de Souza\n2863714\n");
                    break;
                case 2:
                    System.out.println("1) Addition\n2) 3 Value Sum\n3) Division\n4) Greater or Equal\n5) Greater than\n6) Less or Equal\n7) Less Than\n8) Mod\n9) Multiplication\n10 Subtract\n0) Cancel");
                    sel = input.nextInt();
                switch (sel) {
                    case 0 -> 
                        {
                            continue;
                        }
                    case 1 -> 
                        {
                            int a = input.nextInt();
                            int b = input.nextInt();
                            operations.add(new AdditionOperation(a,b));
                        }
                    case 2 ->
                        {
                            operations.add(new AdditionOperation3(input));
                        }
                    case 3 -> 
                        {
                            operations.add(new DivisionOperation(input));
                        }
                    case 4 ->
                        {
                            System.out.println("Write your 2 ints");
                            int num1 = input.nextInt();
                            int num2 = input.nextInt();
                            operations.add(new GreaterEqualOperation(num1,num2));
                        }
                    case 5 -> 
                        {
                            operations.add(new GreaterOperation(input));
                        }
                    case 6 ->
                        {
                            System.out.println("Write your 2 ints");
                            int num2 = input.nextInt();
                            int num1 = input.nextInt();
                            operations.add(new LessEqualOperation(num1, num2));
                        }
                    case 7 -> 
                        {
                            System.out.println("Write your 2 ints");
                            int num2 = input.nextInt();
                            int num1 = input.nextInt();
                            operations.add(new LessOperation(num1,num2));
                        }
                    case 8 -> 
                        {
                            System.out.println("Write your 2 ints");
                            int num2 = input.nextInt();
                            int num1 = input.nextInt();
                            operations.add(new ModOperation(num1, num2));
                        }
                    case 9 -> 
                        {
                            operations.add(new MultiplicationOperation(input));
                        }
                    case 10 -> 
                        {
                            operations.add(new SubtractionOperation(input));
                        }
                    default -> {
                    }
                }
break;
                case 3:
                    System.out.println("Operations: ");
                    for (MathOperation curOp : operations) {
                        System.out.println(curOp.toString() + " " + curOp.getResult());
                    }   break;
                case 4:
                    operations.clear();
                    break;
                case 5:
                    {
                        System.out.println("How would you like to name this file?");
                        String n = input.next();
                        FileWriter saveD = new FileWriter(n);
                        for (MathOperation curOp : operations) {
                            saveD.write(curOp.getPrefix());
                            saveD.write("\n");
                            saveD.write(curOp.toString());
                            saveD.write("\n");
                        }
                        saveD.close();
                        System.out.println("The items were added to the file");
                        break;
                    }
                case 6:
                    {
                        System.out.println("What file would you like to load?");
                        String n = input.next();
                        File myObj = new File(n);
                        Scanner myReader = new Scanner(myObj);
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            if (data.contains("a")){
                                data =myReader.nextLine();
                                String[] stringParts = data.split(" \\+ ");
                                int[] intArray = new int[stringParts.length];
                                for (int i = 0; i < stringParts.length; i++) {
                                    try {
                                        intArray[i] = Integer.parseInt(stringParts[i]);
                                    } catch (NumberFormatException e) {
                                        System.out.println("Error: The string is not a valid integer at index " + i);
                                    }
                                }
                                int a = intArray[0];
                                int b = intArray[1];
                                operations.add(new AdditionOperation(a,b));
                            }else if (data.contains("s3")){
                                data = myReader.nextLine();
                                String[] stringParts = data.split(" \\+ ");
                                int[] intArray = new int[stringParts.length];
                                for (int i = 0; i < stringParts.length; i++) {
                                    try {
                                        intArray[i] = Integer.parseInt(stringParts[i]);
                                    } catch (NumberFormatException e) {
                                        System.out.println("Error: The string is not a valid integer at index " + i);
                                    }
                                }
                                int a = intArray[0];
                                int b = intArray[1];
                                int c = intArray[2];
                                operations.add(new AdditionOperation3(a, b,c));
                                
                            }else if (data.contains("div")){
                                data = myReader.nextLine();
                                String[] stringParts = data.split(" / ");
                                int[] intArray = new int[stringParts.length];
                                for (int i = 0; i < stringParts.length; i++) {
                                    try {
                                        intArray[i] = Integer.parseInt(stringParts[i]);
                                    } catch (NumberFormatException e) {
                                        System.out.println("Error: The string is not a valid integer at index " + i);
                                    }
                                }
                                int a = intArray[0];
                                int b = intArray[1];
                                operations.add(new DivisionOperation(a, b));
                            }else if (data.contains("ge")){
                                data = myReader.nextLine();
                                String[] stringParts = data.split(" >= ");
                                int[] intArray = new int[stringParts.length];
                                for (int i = 0; i < stringParts.length; i++) {
                                    try {
                                        intArray[i] = Integer.parseInt(stringParts[i]);
                                    } catch (NumberFormatException e) {
                                        System.out.println("Error: The string is not a valid integer at index " + i);
                                    }
                                }
                                int a = intArray[0];
                                int b = intArray[1];
                                operations.add(new GreaterEqualOperation(a, b));
                                
                            }else if (data.contains("go")){
                                
                                data = myReader.nextLine();
                                String[] stringParts = data.split(" > ");
                                int[] intArray = new int[stringParts.length];
                                for (int i = 0; i < stringParts.length; i++) {
                                    try {
                                        intArray[i] = Integer.parseInt(stringParts[i]);
                                    } catch (NumberFormatException e) {
                                        System.out.println("Error: The string is not a valid integer at index " + i);
                                    }
                                }
                                int a = intArray[0];
                                int b = intArray[1];
                                operations.add(new GreaterOperation(a, b));
                                
                            }else if (data.contains("le")){
                                data = myReader.nextLine();
                                String[] stringParts = data.split(" <= ");
                                int[] intArray = new int[stringParts.length];
                                for (int i = 0; i < stringParts.length; i++) {
                                    try {
                                        intArray[i] = Integer.parseInt(stringParts[i]);
                                    } catch (NumberFormatException e) {
                                        System.out.println("Error: The string is not a valid integer at index " + i);
                                    }
                                }
                                int a = intArray[0];
                                int b = intArray[1];
                                operations.add(new LessEqualOperation(a, b));
                            }else if (data.contains("lo")) {
                                data = myReader.nextLine();
                                String[] stringParts = data.split(" < ");
                                int[] intArray = new int[stringParts.length];
                                for (int i = 0; i < stringParts.length; i++) {
                                    try {
                                        intArray[i] = Integer.parseInt(stringParts[i]);
                                    } catch (NumberFormatException e) {
                                        System.out.println("Error: The string is not a valid integer at index " + i);
                                    }
                                }
                                int a = intArray[0];
                                int b = intArray[1];
                                operations.add(new LessOperation(a, b));
                            }else if (data.contains("mo")){
                                data = myReader.nextLine();
                                String[] stringParts = data.split(" mod ");
                                int[] intArray = new int[stringParts.length];
                                for (int i = 0; i < stringParts.length; i++) {
                                    try {
                                        intArray[i] = Integer.parseInt(stringParts[i]);
                                    } catch (NumberFormatException e) {
                                        System.out.println("Error: The string is not a valid integer at index " + i);
                                    }
                                }
                                int a = intArray[0];
                                int b = intArray[1];
                                operations.add(new ModOperation(a, b));
                            }else if (data.contains("mul")){
                                data = myReader.nextLine();
                                String[] stringParts = data.split(" x ");
                                int[] intArray = new int[stringParts.length];
                                for (int i = 0; i < stringParts.length; i++) {
                                    try {
                                        intArray[i] = Integer.parseInt(stringParts[i]);
                                    } catch (NumberFormatException e) {
                                        System.out.println("Error: The string is not a valid integer at index " + i);
                                    }
                                }
                                int a = intArray[0];
                                int b = intArray[1];
                                operations.add(new MultiplicationOperation(a, b));
                            }else if (data.contains("su")){
                                data = myReader.nextLine();
                                String[] stringParts = data.split(" \\- ");
                                int[] intArray = new int[stringParts.length];
                                for (int i = 0; i < stringParts.length; i++) {
                                    try {
                                        intArray[i] = Integer.parseInt(stringParts[i]);
                                    } catch (NumberFormatException e) {
                                        System.out.println("Error: The string is not a valid integer at index " + i);
                                    }
                                }
                                int a = intArray[0];
                                int b = intArray[1];
                                operations.add(new SubtractionOperation(a, b));
                            }
                            System.out.println(data);
                        }       System.out.println("\nWe reached the end of that file");
                        break;
                    }
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }
    }
}
