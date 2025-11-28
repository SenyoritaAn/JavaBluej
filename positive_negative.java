import java.util.Scanner;

/**
 * Write a description of class positive_negative here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class positive_negative
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        
        if (num > 0){
            System.out.println("Positive");
        } else if(num <0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
            
        }
        }
        
        
        }
        