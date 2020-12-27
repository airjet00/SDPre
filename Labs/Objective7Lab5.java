import java.util.Scanner;
public class Objective7Lab5{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    int selection;

    while(true){
        System.out.println("_____Menu_____");
        System.out.println("1: Say Hello");
        System.out.println("2: List My favorite foods");
        System.out.println("3: Exit\n");

        selection = kb.nextInt();

        if (selection == 1){
          System.out.println("Hello World");
        }
        else if(selection == 2){
          System.out.println("Apple, Banana, Coconut");
        }
        else if (selection == 3){
          System.out.println("Goodbye");
          break;
        }
    }
    kb.close();
  }
}
