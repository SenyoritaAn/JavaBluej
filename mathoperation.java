
/**
 * Write a description of class mathoperation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mathoperation
{
    public static void main(String[]args){
    int a = 10;
    int b = 5;
    System.out.println("Arithmetic:");
    
    int sum = a+b;
    System.out.println("Sum is :"+sum);
    
    int diff = a-b;
    System.out.println("Difference is :"+diff);
    
    int product = a*b;
    System.out.println("Product is : " +product);
    
    int div = a/b;
    System.out.println("Divison is : " +div);
    
    int mod = a%b;
    System.out.println("Modulus is : " +mod);
    System.out.println();
    
    
    //  UNARY (POST INC AND PRE INC)
    System.out.println("Unary:");
    int inc = ++a;
    System.out.println("Increment is : "+inc);
    
    int dec = --a;
    System.out.println("Decrement is : "+dec);
    System.out.println();
    
    //Assigment operators//
    System.out.println("Assignment:");
    int y = 20;
    y +=5;
    System.out.println("Add and assign :"+y);
    y -=6;
    System.out.println("Sub and assign :"+y);
    y *=6;
    System.out.println("Product and assign :"+y);
    y /=7;
    System.out.println("Difference and assign :"+y);
    y %=8;
    System.out.println("Modulus and assign :"+y);
    System.out.println();
    
    
    // 5. Logical Operators
    System.out.println("Logical:");
    boolean p = true;
    boolean q = false;
    System.out.println("p && q : " + (p && q));
    System.out.println("p || q : " + (p || q));
    System.out.println("!p : " + (!p));
    System.out.println();

        // 6. Ternary Operator
        System.out.println("Ternary:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a & b = " + max);
    
    
    
    }
}