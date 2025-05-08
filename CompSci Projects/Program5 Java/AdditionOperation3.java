/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis260;

import java.util.Scanner;

/**
 *
 * @author Mark Grimké
 */
public class AdditionOperation3 extends MathOperation
{
        private int num3;
        
        public AdditionOperation3(Scanner input)
        {
            super(input);
            num3 = input.nextInt();
            setPrefix("s3");
        }
        
        public AdditionOperation3(int num1, int num2, int num3)
        {
            super(num1,num2);
            this.num3 = num3;
            setPrefix("s3");
        }

        public String printResult()
        {
                return(String.format("%d + %d + %d = %.2f", getNum1(), getNum2(), num3, getResult()));
        }

        public double getResult()
        {
                return(getNum1() + getNum2() +num3);
        }

        public String toString()
        {
                return(String.format("%d + %d + %d", getNum1(), getNum2(), num3));
        }
}
