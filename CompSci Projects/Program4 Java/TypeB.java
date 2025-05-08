/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg4;

/**
 *
 * @author Rebeca
 */
public class TypeB {
    private int val1;
    private int val2;
    private int val3;
    public TypeB(int val1, int val2, int val3) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }
    public int getValue() {
        return val1 + val2 * val3;
    }
    public int sum(){
        return val1+val2+val3;
    }
    
    public TypeA performOperation(TypeA typeA) {
        int resultValue = getValue() * (typeA.getValue());
        return new TypeA(resultValue, sum());
    }

    public TypeA performOperation(TypeB anotherTypeB) {
        int resultValue = getValue();
        int resultValue2 = anotherTypeB.getValue();
        return new TypeA(resultValue, resultValue2);
    }
    
    @Override
    public String toString() {
        return "[TypeB " + val1 + ", " + val2 + ", " + val3 + "]";
    }
    
}
