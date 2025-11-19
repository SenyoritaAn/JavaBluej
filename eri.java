import java.util.Scanner;

/**
 * Write a description of class eri here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class eri
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter medicine name: ");
        String name = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = Integer.parseInt(sc.nextLine());  

        System.out.print("Enter price per tablet: ");
        double price = Double.parseDouble(sc.nextLine()); 

        System.out.print("Requires prescription (Yes/No): ");
        String pres = sc.nextLine();
        
        System.out.println("available stock :1000");
        
        System.out.println("====================================");
        System.out.println("        Aushadhi Pasal Report       ");
        System.out.println("====================================");
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + qty);
        System.out.println("Price (NPR): " + price);
        System.out.println("Prescription: " + pres);
        System.out.println("====================================");
    }
}
