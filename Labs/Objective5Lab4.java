import java.util.Scanner;

public class Objective5Lab4{
  public static void main(String[] args){

      Scanner kb = new Scanner(System.in);

      //get user to enter num
      System.out.println("Please enter a number: ");
      int userNum = kb.nextInt();

      //if num is zero
      if (userNum == 0){
        System.out.println("The number is zero");
      }
      // if num is even
      else if (userNum % 2 == 0 ){
        System.out.println("The number is even");
      }
      //else num is odd
      else{
        System.out.println("The number is odd");
      }
  }
}
