/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis260;

/**
 *
 * @author fiske
 */
public class ModOperation extends MathOperation {
    
    public ModOperation(int num1,int num2)
    {
        super(num1,num2);
        setPrefix("mo");
    }
    
    public String printResult()
    {
        return(String.format("%d %% %d = %f", this.getNum1(), this.getNum2(), getResult()));
    }
    
    public double getResult()
    {
        return(getNum1() % getNum2());
    }
    
    public String toString()
    {
        return(String.format("%d %%  %d", this.getNum1(),this.getNum2()));
    }
}
