
/**
 * Write a description of class smallmarks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class smallmarks
{
    public static void main(String[] args)
    {
        int[][] marks = {
            {80, 75},  // student 1
            {90, 85}   // student 2
        };
        System.out.println("Nepali  English");
        for(int i = 0; i < 2; i++)
        {
            int total = 0;
            for(int j = 0; j < 2; j++)
            {
                System.out.print(marks[i][j] + "\t");
                total += marks[i][j];
            }
            System.out.println(" Total = " + total);
        }
    }
}
