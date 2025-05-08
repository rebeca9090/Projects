/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg4;

/**
 *
 * @author Rebeca
 */
public class TypeA 
{
    private int val1, val2;
    public TypeA(int val1, int val2)
    {
        this.val1 = val1;
        this.val2 = val2;
    }
    public int getValue() 
    {
        return val1 + val2;
    }
    public int performOperation(TypeB typeB) {
        int result = getValue() + (typeB.getValue());
        return result;
    }

    public int performOperation(TypeA anotherTypeA) {
        int result = getValue() + (anotherTypeA.getValue());
        return result;
    }
    
    @Override
    public String toString() {
        return "(TypeA " + val1 + ", " + val2 + ")";
    }
}
