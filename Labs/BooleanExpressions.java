import java.util.Scanner;

public class BooleanExpressions{

  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    boolean bool1, bool2, bool3, bool4, bool5, bool6;
    double dbl1, dbl2;
    //String wombat;

    System.out.println("Please choose two numbers.");
    System.out.println("First number: ");
    dbl1 = kb.nextDouble();
    System.out.println("Second number: ");
    dbl2 = kb.nextDouble();
    System.out.println("Enter wombat: ");
    String wombat = kb.nextLine();
    //System.out.println("Here is " + wombat);

    bool1 = (dbl1 < dbl2);
    bool2 = (dbl1 > dbl2);
    bool3 = (dbl1 <= dbl2);
    bool4 = (dbl1 >= dbl2);
    bool5 = (dbl1 == dbl2);
    bool6 = (dbl1 != dbl2);

    System.out.println(dbl1 + " is less than " + dbl2 + ": " + bool1);
    System.out.println(dbl1 + " is greater than " + dbl2 + ": " + bool2);
    System.out.println(dbl1 + " is less than or equal to " + dbl2 + ": " + bool3);
    System.out.println(dbl1 + " is greater than or equal to " + dbl2 + ": " + bool4);
    System.out.println(dbl1 + " is equal to " + dbl2 + ": " + bool5);
    System.out.println(dbl1 + " is not equal to " + dbl2 + ": " + bool6);

    // for comparing strings use .equals() or .compareTO() and NOT ==
        // example: apple.compareTO(banana) or apple.equals(banana)
    //System.out.println("Enter wombat: ");
    wombat = kb.nextLine();

    System.out.println("Here is " + wombat);

  }
}
