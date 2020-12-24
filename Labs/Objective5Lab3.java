import java.util.Scanner;

public class Objective5Lab3{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    int userNum;

    System.out.println("Please enter a number: ");
    userNum = kb.nextInt();

    //if number is greater than zero
    if (userNum > 0){
      System.out.println("The number is positive");
    }
    //if number is less than zero
    else if (userNum < 0){
      System.out.println("The number is negative");
    }
    //if number is zero
    else{
      System.out.println("The number is zero");
    }

    kb.close();
  }
}
