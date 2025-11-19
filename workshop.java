
/**
 * Write a description of class workshop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop
{
    int age; // instance variable
    static int qty; // static variable
    
    public static void main(String[]args)
    {
        // <classname> <variable>=new <className>();
        int age=18;// local variable
        
        workshop v1= new workshop(); // calling instance variable in static method
        System.out.println(v1.age);
        
        System.out.println(age);
        System.out.println(workshop.qty);
        
        System.out.println("Third Week of programming.");
    }
}