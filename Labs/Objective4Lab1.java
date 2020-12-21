import java.util.Scanner;

public class Objective4Lab1{
  public static void main(String[] args){

    Scanner kb = new Scanner(System.in);

    String fName = "";
    String lName = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";

    //TODO prompt the user to get input for all of
    //the String variables.
    System.out.println("What is your first name?");
    fName = kb.nextLine();

    System.out.println("What is your last name?");
    lName = kb.nextLine();

    System.out.println("What is your favorite animal?");
    favoriteAnimal = kb.nextLine();

    System.out.println("What is your favorite food?");
    favoriteFood = kb.nextLine();

    System.out.println("What is your favorite song?");
    favoriteSong = kb.nextLine();

    System.out.println("My name is " +fName+" "+lName+".");
    System.out.println("My favorite animal is "+favoriteAnimal+".");
    System.out.println("My favorite food is "+favoriteFood+".");
    System.out.println("My favorite song is " +favoriteSong+".");



     //TODO print the output formatted to look like
     //the expected output using String concatenation.

  }
}
