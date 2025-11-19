import java.util.Scanner;

/**
 * Write a description of class islington here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class islington{
   public static void main(String[] args){
       System.out.println("Coverage of scanner class");
       Scanner scan= new Scanner(System.in);
       System.out.println("Enter one number :");
       double firstNUm= scan.nextDouble();
       System.out.println(firstNUm);
       
       
       // Ternary Operator
       int age=18; // Scanner
       String isValid =(age >= 18) ? "He can drive" : "He cannot drive" ; // true : false
       
    }
}
