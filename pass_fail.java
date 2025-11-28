import java.util.Scanner;

/**
 * Write a description of class pass_fail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pass_fail
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter marks:");
        int marks = sc.nextInt();
        
        if(marks >= 35){
            System.out.println("Pass");
        } else 
        System.out.println("Fail");
    }
}

        
    