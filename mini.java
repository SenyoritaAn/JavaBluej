
/**
 * Write a description of class mini here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mini
{
    public static void main(String[] args)
    {
        String[][] seats = new String[2][3];

        seats[0][0] = "prince";
        seats[0][1] = "hero";
        seats[0][2] = "navadita";
        // row 1 stays empty

        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                String s = seats[i][j];
                if (s == null) s = "empty";
                System.out.print("[" + s + "] ");
            }
            System.out.println();
        }
    }
}

