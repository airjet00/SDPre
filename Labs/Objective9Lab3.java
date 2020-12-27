import java.util.Scanner;

//class that prints menu for three selection 1-3 and prints response 
public class Objective9Lab3{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    int selection;

    while(true){
      printMenu();                        //call printMenu method
      selection = kb.nextInt();

      if (selection == 1){                //if-else menu selection
        System.out.println("Hello");
      }
      else if(selection == 2) {
        System.out.println("Apple, Banana, Pear");
      }
      else if (selection == 3){
        System.out.println("Goodbye");
        break;
      }
      else{
        System.out.println("Invalid entry, try again");
      }
      // code here


    }
    kb.close();
  }

  public static void printMenu(){             // start printMenu method
    System.out.println("____Menu____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite food");
    System.out.println("3: Exit\n");
  }
}
