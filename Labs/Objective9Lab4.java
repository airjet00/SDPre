import java.util.Scanner;

// takes two user imput numbers and calculates the average, returns and prints result. 
public class Objective9Lab4{
  public static void main(String[] args){                     //main method
    Scanner kb = new Scanner(System.in);
    double num1, num2, average;

    System.out.println("Please give me a number: ");          // get user input
      num1 = kb.nextDouble();
    System.out.println("Please give me another number: ");
      num2 = kb.nextDouble();

    average = findAverage(num1, num2);                        //call findAverage method
    System.out.println("The average of " + num1 +" and " + num2 + " is: " + average);

    kb.close();
  }
  public static double findAverage(double x, double y){       // findAverage method to calc average of two numbers
    double average = (x+y)/2;
    return average;
  }
}
