/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8;

import java.io.File;
import java.io.FileWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fiske
 */
public class Cis260_hw8 {

    static int indentLevel = 0;
    static FileWriter writer;

    static int getNum(int low, int high) {
        randNum = randNum.add(randNum.divide(BigInteger.valueOf(10)));//.add(randNum.multiply(BigInteger.valueOf(3)))).longValue();
        BigInteger range = BigInteger.valueOf(high - low);
        return (low + (randNum.mod(range)).intValue());
    }

    static ArrayList<Integer> usedInts = new ArrayList();

    static BigInteger randNum;

    public static int getUniqueInt(int low, int high) {
        int num;
        while (true) {
            num = getNum(low, high);

            if (usedInts.contains(num) == false) {
                usedInts.add(num);
                return (num);
            }
        }
    }

    static void write(String str) throws Exception {
        for (int i = 0; i < indentLevel; i++) {
            writer.write("\t");
        }
        writer.write(str + '\n');
    }

    static void startBlock() throws Exception {
        for (int i = 0; i < indentLevel; i++) {
            writer.write("\t");
        }
        writer.write("{\n");
        indentLevel++;
    }

    static void endBlock() throws Exception {
        indentLevel--;
        for (int i = 0; i < indentLevel; i++) {
            writer.write("\t");
        }
        writer.write("}\n");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String line;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your student ID");
        String id = input.nextLine();
        if (id.length() != 7) {
            System.out.println("Could not read id");
            System.exit(1);
        }

        try {
            //12 0 8 11 9 6 15 1 2 3
            long num = Long.parseLong(id);
            num = num - 2000000;
            num *= 3;
            randNum = BigInteger.valueOf(num);

            writer = new FileWriter(new File("BaseClass.java"));

            line = "public class BaseClass";
            write(line);
            startBlock();

            line = "protected int alpha, beta, other;";
            write(line);

            line = "public BaseClass()";
            write(line);

            startBlock();
            line = String.format("alpha = %d;", getUniqueInt(0, 200));
            write(line);

            line = String.format("other = %d;", getUniqueInt(0, 200));
            write(line);

            line = String.format("beta = %d;", getUniqueInt(10, 200));
            write(line);

            endBlock();

            line = "public BaseClass(int b, int a)";
            write(line);
            startBlock();

            line = String.format("other = %d;", getUniqueInt(0, 200));
            write(line);

            line = "System.out.println(\"F\");";
            write(line);

            line = "beta = a;";
            write(line);

            line = "alpha = b;";
            write(line);

            endBlock();

            line = "public void method(int x)";
            write(line);
            startBlock();

            write("try");
            startBlock();
            line = "x = x / 0;";
            write(line);
            line = "x = 123456;";
            write(line);
            endBlock();
            write("catch(Exception e)");
            startBlock();
            write(String.format("System.out.print(%d);", getUniqueInt(20, 200)));
            endBlock();

            line = "System.out.printf(\"method: %d\", x);";
            write(line);

            endBlock();

            line = "public int add(int x)";
            write(line);
            startBlock();

            line = String.format("other = %d;", getUniqueInt(0, 200));
            write(line);

            line = "System.out.println(\"E\");";
            write(line);
            line = "return(x + alpha + beta);";
            write(line);
            endBlock();

            line = "public int add()";
            write(line);
            startBlock();
            line = String.format("System.out.print(\"%s\");", id.charAt(4) < '5' ? "add" : "div");
            write(line);
            line = String.format("other = %d;", getUniqueInt(0, 200));
            write(line);
            line = "return(alpha - beta);";
            write(line);

            endBlock();

            line = "public int add(BaseClass x)";
            write(line);
            startBlock();
            line = String.format("int %c = x.alpha;", id.charAt(5) < '4' ? 'a' : 'b');
            write(line);

            line = String.format("int %c = x.alpha;", id.charAt(5) >= '4' ? 'a' : 'b');
            write(line);
            line = "int c = x.add(b);";
            write(line);
            line = "System.out.printf(\"D %d %d %d\\n\", a, b, c);";
            write(line);
            line = String.format("other = %d;", getUniqueInt(0, 200));
            write(line);
            line = "return(a + b + c);";
            write(line);

            endBlock();

            line = "public String toString()";
            write(line);
            startBlock();
            line = "return(String.format(\"(A: %d %d)\", alpha, beta));";
            write(line);
            endBlock();

            endBlock();

            writer.close();

            writer = new FileWriter(new File("AlphaClass.java"));

            line = "public class AlphaClass extends BaseClass";
            write(line);
            startBlock();

            line = String.format("int other;");
            write(line);

            line = "public AlphaClass()";
            write(line);
            startBlock();
            write("super(1,2);");
            write("System.out.println(\"D\");");
            line = String.format("other = %d;", getUniqueInt(0, 200));
            write(line);
            endBlock();

            write("public AlphaClass(int a, int b)");
            startBlock();
            write("super(b, a);");
            write("System.out.println(\"C\");");

            line = String.format("other = %d;", getUniqueInt(0, 200));
            write(line);

            endBlock();

            write("public int add()");
            startBlock();
            write("System.out.println(\"B\");");
            write(String.format("int val = super.add(%d);", getUniqueInt(101, 300)));

            line = String.format("other = %d;", getUniqueInt(0, 200));
            write(line);

            write("return(val);");
            endBlock();

            write("public String toString()");
            startBlock();
            line = String.format("other = %d;", getUniqueInt(0, 200));
            write(line);
            write("return(\"[B\" + super.toString() + \"]\");");
            endBlock();

            endBlock();

            writer.close();

            writer = new FileWriter(new File("BetaClass.java"));

            write("public class BetaClass extends BaseClass");
            startBlock();
            line = String.format("int other;");
            write(line);
            write("public BetaClass()");
            startBlock();
            write("super();");
            line = String.format("other = %d;", getUniqueInt(0, 200));
            write(line);
            endBlock();

            write("public BetaClass(int a, int b)");
            startBlock();
            write("super(a, a);");
            line = String.format("other = %d;", getUniqueInt(0, 200));
            write(line);
            endBlock();

            write("public int add(BaseClass x)");
            startBlock();
            write("System.out.println(\"A\");");
            line = String.format("other = %d;", getUniqueInt(0, 200));
            write(line);
            write(String.format("alpha = x.add(%d);", getUniqueInt(0, 200)));
            write(String.format("return(50 + x.add(%d));", getUniqueInt(0, 200)));
            endBlock();

            write("public int add(int x, int y)");
            startBlock();
            line = String.format("other = %d;", getUniqueInt(0, 200));
            write(line);
            write("int a = super.add(x);");
            write("int b = super.add(y);");
            write("alpha = a + b;");
            write("System.out.printf(\"x, %d, %d, %d\\n\", x, a, b);");
            write("return(a + b);");
            endBlock();

            write("public String toString()");
            startBlock();
            line = String.format("other = %d;", getUniqueInt(0, 200));
            write(line);
            write("return(\"(C)\");");
            endBlock();
            endBlock();

            writer.close();

            char c1, c2;
            if (((int) (id.charAt(6)) + (int) (id.charAt(5)) % 2) == 0) {
                c1 = 'x';
                c2 = 'y';
            } else {
                c1 = 'y';
                c2 = 'x';
            }
            writer = new FileWriter(new File("quiz_" + id + ".java"));
            write("public class quiz_" + id);
            startBlock();
            write("public static void main(String[] args)");
            startBlock();

            line = String.format("int x = %d, y = 1%d;", getUniqueInt(0, 200), getUniqueInt(100, 200));
            write(line);

            line = String.format("BaseClass alpha = new BaseClass(%d, %d);", getUniqueInt(0, 200), getUniqueInt(0, 200));
            write(line);
            line = "//value of: alpha.alpha: ____ alpha.beta: ___ x: ___  y: ___";
            write(line);

            line = String.format("%c = alpha.add();", c2);
            write(line);
            line = "//value of: alpha.alpha: ____ alpha.beta: ___ x: ___  y: ___";
            write(line);

            line = String.format("%c = alpha.add(%c);", c1, (id.charAt(6) - '0') % 2 == 0 ? 'x' : 'y');
            write(line);
            line = "//value of: alpha.alpha: ____ alpha.beta: ___ x: ___  y: ___";
            write(line);

            line = "y = alpha.add(alpha);";
            write(line);
            line = "//value of: alpha.alpha: ____ alpha.beta: ___ x: ___  y: ___";
            write(line);

            line = String.format("alpha = new AlphaClass(%d, %d);", getUniqueInt(0, 200), getUniqueInt(0, 200));
            write(line);
            line = "//value of: alpha.alpha: ____ alpha.beta: ___ x: ___  y: ___";
            write(line);

            line = String.format("%c = alpha.add();", c2);
            write(line);
            line = "//value of: alpha.alpha: ____ alpha.beta: ___ x: ___  y: ___";
            write(line);

            line = String.format("%c = alpha.add(%c);", c1, (id.charAt(6) - '0') % 2 == 0 ? 'x' : 'y');
            write(line);
            line = "//value of: alpha.alpha: ____ alpha.beta: ___ x: ___  y: ___";
            write(line);

            line = "y = alpha.add(alpha);";
            write(line);
            line = "//value of: alpha.alpha: ____ alpha.beta: ___ x: ___  y: ___";
            write(line);

            line = String.format("alpha = new BetaClass(%d, %d);", getUniqueInt(0, 200), getUniqueInt(0, 200));
            write(line);
            line = "//value of: alpha.alpha: ____ alpha.beta: ___ x: ___  y: ___";
            write(line);

            line = String.format("%c = alpha.add();", c2);
            write(line);
            line = "//value of: alpha.alpha: ____ alpha.beta: ___ x: ___  y: ___";
            write(line);

            line = String.format("%c = alpha.add(%c);", c1, (id.charAt(6) - '0') % 2 == 0 ? 'x' : 'y');
            write(line);
            line = "//value of: alpha.alpha: ____ alpha.beta: ___ x: ___  y: ___";
            write(line);

            line = "y = alpha.add(alpha);";
            write(line);
            line = "//value of: alpha.alpha: ____ alpha.beta: ___ x: ___  y: ___";
            write(line);

            line = String.format("alpha.method(%d);", getUniqueInt(0, 600));
            write(line);

            String[] names = new String[3];
            if (id.charAt(6) < '3') {
                names[0] = "BaseClass";
                names[1] = "AlphaClass";
                names[2] = "BetaClass";
            } else if (id.charAt(6) < '6') {
                names[2] = "BaseClass";
                names[0] = "AlphaClass";
                names[1] = "BetaClass";
            } else {
                names[1] = "BaseClass";
                names[2] = "AlphaClass";
                names[0] = "BetaClass";
            }

            line = "BaseClass[] arr = new BaseClass[3];";
            write(line);

            line = String.format("arr[0] = new %s();", names[0]);
            write(line);
            line = String.format("arr[1] = new %s();", names[1]);
            write(line);
            line = String.format("arr[2] = new %s();", names[2]);
            write(line);

            line = "for(int i = 0; i < 3; i++)";
            write(line);
            startBlock();

            line = "BaseClass tmp = arr[(i + 1) % 3];";
            write(line);

            line = "BaseClass val = arr[i];";
            write(line);

            line = "val.add(tmp);";
            write(line);

            line = "System.out.print(val);";
            write(line);

            endBlock();

            line = "alpha = arr[0];";
            write(line);
            line = "//value of: alpha.alpha: ____ alpha.beta: ___ x: ___  y: ___";
            write(line);

            line = "alpha = arr[1];";
            write(line);
            line = "//value of: alpha.alpha: ____ alpha.beta: ___ x: ___  y: ___";
            write(line);
            line = "alpha = arr[2];";
            write(line);
            line = "//value of: alpha.alpha: ____ alpha.beta: ___ x: ___  y: ___";
            write(line);

            line = "AlphaClass test1 = new AlphaClass();";
            write(line);
            line = String.format("test1.other = %d;", getUniqueInt(0, 1000));
            write(line);
            line = "BaseClass test2 = test1;";
            write(line);
            line = String.format("test2.other = %d;", getUniqueInt(0, 1000));
            write(line);

            line = "//value of: test1.alpha: ____ test1.beta: ___ x: ___  y: ___";
            write(line);
            line = "//value of: test2.alpha: ____ test2.beta: ___ ";
            write(line);

            line = "BaseClass test3 = new BaseClass();";
            write(line);
            line = String.format("test3.other = %d;", getUniqueInt(0, 1000));
            write(line);
            line = "test2 = test3;";
            write(line);

            line = "//value of: test1.alpha: ____ test1.beta: ___ x: ___  y: ___";
            write(line);
            line = "//value of: test2.alpha: ____ test2.beta: ___ ";
            write(line);
            line = "//value of: test3.alpha: ____ test3.beta: ___ ";
            write(line);

            line = String.format("test2.other = %d;", getUniqueInt(0, 1000));
            write(line);
            line = "//value of: test1.alpha: ____ test1.beta: ___ x: ___  y: ___";
            write(line);
            line = "//value of: test2.alpha: ____ test2.beta: ___ ";
            write(line);
            line = "//value of: test3.alpha: ____ test3.beta: ___ ";
            write(line);
            endBlock();
            endBlock();
            writer.close();
        } catch (Exception e) {
            System.out.println("Could not create file\n");
        }

    }

}
