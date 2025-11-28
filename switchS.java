import java.util.Scanner;

/**
 * Write a description of class switchS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class switchS
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float mp, sp, discount = 0;
        char category;

        System.out.print("Enter marked price: ");
        mp = sc.nextFloat();

        System.out.print("Enter category (A/B/C/D): ");
        category = sc.next().charAt(0);

        category = Character.toUpperCase(category);

        switch(category) {
            case 'A':
                discount = 60;
                break;

            case 'B':
                discount = 40;
                break;

            case 'C':
                discount = 20;
                break;

            case 'D':
                discount = 10;
                break;

            default:
                System.out.println("Invalid Category!");
                return;
        }

        sp = mp - (mp * discount / 100);

        System.out.println("Selling Price = " + sp);
    }
}