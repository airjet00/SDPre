import java.util.Scanner;

public class Objective4Lab3{
  public static void main(String[] args){
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    age = input.nextInt();

    currentYear = 2020;

    birthYear = currentYear - age; // calc birth year 

    System.out.println("You were born in "+ birthYear);
    input.close();


  }
}
