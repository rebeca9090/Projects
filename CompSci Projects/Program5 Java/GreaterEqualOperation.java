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
public class GreaterEqualOperation extends GreaterOperation
{
        public GreaterEqualOperation(int num1,int num2)
        {
                super(num1,num2);
                setOperation(">=");
                setPrefix("ge");
        }

        public String toString()
        {
                return(String.format("%d >= %d", this.getNum1(),this.getNum2()));
        }

        public double getResult()
        {
                int result;
                if (this.getNum1() > this.getNum2() || this.getNum1() == this.getNum2())
                {
                        result = 1;
                }
                else
                {
                        result = 0;
                }
                
                return((double)result);
        }
        
        public String printResult()
        {
                if (getResult() == 1)
                {
                        return(String.format("%d is greater than or equal to %d", this.getNum1(), this.getNum2()));
                }
                else
                {
                        return(String.format("%d is not greater than or equal to %d", this.getNum1(), this.getNum2()));
                }
        }
}
