import java.util.Scanner;

/**
 * Write a description of class distrcits here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class distrcits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] dist = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};
        System.out.println("Districts:");
        for(int i = 0; i < dist.length; i++)
        {
            System.out.println((i+1) + ". " + dist[i]);
        }
        System.out.print("Enter number of districts: ");
        int n = sc.nextInt();
        sc.nextLine(); // to clear buffer
        String[] newDist = new String[n];
        System.out.println("Enter district names:");
        for(int i = 0; i < n; i++)
        {
            newDist[i] = sc.nextLine();
        }
        System.out.println("Updated Districts:");
        for(int i = 0; i < n; i++)
        {
            System.out.println((i+1) + ". " + newDist[i]);
        }
    }
}
