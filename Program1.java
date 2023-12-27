/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program1;
import java.lang.Math;
/**
 *
 * @author guest-oezuq4
 */
public class Program1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int StudentID = 2863714;
        double result1;
        double result2;
        double result3;
        int llx;
        int lly;
        int urx;
        int ury;
        llx = 1;
        lly = 0;
        urx = 3;
        ury = 1;
        
        
        result1 = (urx - llx)*(ury-lly);
        result2 = 2*(urx - llx) + 2*(ury-lly);
        //diagonal of a rectangle formula is d= sqrt(w^2+l^2)got this from google
        result3 = Math.sqrt(Math.pow(urx-llx, 2)+(Math.pow(ury-lly, 2)));
        
        //done at 12:54
       
    }
    
}
