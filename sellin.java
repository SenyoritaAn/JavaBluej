import java.util.Scanner;

/**
 * Write a description of class sellin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sellin
{
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float mp, sp, discount = 0;
        char category;

        System.out.print("Enter marked price:");
        mp = sc.nextFloat();

        System.out.print("Enter category (A/B/C/D):");
        category = sc.next().charAt(0);

        if(category == 'A' || category == 'a') {
            discount = 60;
        } else if(category == 'B' || category == 'b') {
            discount = 40;
        } else if(category == 'C' || category == 'c') {
            discount = 20;
        } else if(category == 'D' || category == 'd') {
            discount = 10;
        } else {
            System.out.println("Invalid Category!");
            return; 
        }

        sp = mp - (mp * discount / 100);

        System.out.println("Selling Price = " + sp);
    }
}
