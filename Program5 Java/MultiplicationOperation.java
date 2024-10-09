/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis260;

import java.util.Scanner;

/**
 *
 * @author fiske
 */
public class MultiplicationOperation extends MathOperation{
    
    public MultiplicationOperation(Scanner input)
    {
        super(input);
        setOperation('x');
        setPrefix("mul");
    }
    
    
    public MultiplicationOperation(int num1,int num2)
    {
        super(num1,num2);
        setOperation('x');
        setPrefix("mul");
    }
    
    public String toString()
    {
        return(String.format("%d x %d", this.getNum1(),this.getNum2()));
    }

    
    
    public double getResult()
    {
        return(this.getNum1() * this.getNum2());
    }
}
