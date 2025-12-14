import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {

        String[] names = {"Saroj", "Sushant", "Ujjwal", "Rabina", "Sandesh"};
        System.out.println("Student names:");
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.print("Name at index 2: " + names[2]);
        names[4] = "NewName";
        System.out.println("Updated index 4: " + names[4]);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a new name: ");
        String newName = sc.nextLine();
        names[1] = newName;
        System.out.println("Updated array:");
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        sc.close();
    }
}
    