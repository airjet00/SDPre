import java.util.Scanner;

public class Objective9Lab5{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
      double num1, num2, sumAnswer, avgAnswer, taxAnswer;
      int choice;
      boolean keepGoing = true;
//Part 1:
    System.out.println("Please give me a number: ");
      num1 = kb.nextDouble();
//Part 2:
    System.out.println("Please give me another number: ");
      num2 = kb.nextDouble();

    while(keepGoing){       //loop for menu
      printMenu();          //menu method here
      System.out.println("Which would you like to do? ");
      choice = kb.nextInt();

//Part 3
      switch(choice){       //choice to call method
        case 1:
        // to call findSum method
          sumAnswer = findSum(num1, num2);
          System.out.println(num1 + " + " + num2 + " = " + sumAnswer);
          break;
        case 2:
        //to call findAverage method
          avgAnswer = findAverage(num1, num2);
          System.out.println("The average of "+num1+" and "+num2+" is "+avgAnswer);
          break;
        case 3:
          taxAnswer = calcTax(num1, num2);
          System.out.println("The amount in tax to be collected from a purchase"
              +" of "+num1+ " and "+num2+" is: "+taxAnswer);
          break;
        case 4:
        //to exit the loop and term the program
          System.out.println("You've chosen to quit");
          keepGoing = false;
          break;
        //default for invalid entry
        default:
          System.out.println("Invalid entry. Please try again");
          break;

      }
    }
    kb.close();
  }
  //printMenu method
  public static void printMenu(){
    System.out.println("\n========= MENU =========");
    System.out.println("|                      |");
    System.out.println("|   1. Add Numbers     |");
    System.out.println("|   2. Find Average    |");
    System.out.println("|   3. Calculate Tax   |");
    System.out.println("|   4. Exit            |");
    System.out.println("|                      |");
    System.out.println("========================\n");
  }
  //findSum method w/ two param returns sum of two numbers
  public static double findSum(double x, double y){
    double answer = x + y;
    return answer;
  }
  //findAverage method returns the average from findSum method
  public static double findAverage(double x, double y){
    double sumAnswer = findSum(x, y);
    double avgAnswer = sumAnswer/2;
    return avgAnswer;
  }
  public static double calcTax(double x, double y){
    double sumAnswer = findSum(x,y);
    double taxAnswer = sumAnswer * .0831;
    return taxAnswer;
  }
}
