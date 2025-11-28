import java.util.Scanner;

/**
 * Write a description of class scholarship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scholarship
{
public class ScholarshipChecker
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();

        System.out.print("Enter attendance (%): ");
        double attendance = sc.nextDouble();

        System.out.print("Enter attitude score (1–10): ");
        int attitude = sc.nextInt();

        // Nested if conditons use gareko
        if (gpa >= 3.2) {
            if (attendance > 80) {
                if (attitude < 5) {
                    System.out.println("Student is eligible for the scholarship.");
                } else {
                    System.out.println("Not eligible – Attitude score too high.");
                }
            } else {
                System.out.println("Not eligible – Attendance too low.");
            }
        } else {
            System.out.println("Not eligible – GPA below requirement.");
        }
    }
}

}