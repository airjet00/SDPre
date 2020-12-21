public class Objective3Experimentation{
  public static void main(String[] args){

    java.util.Scanner scanner = new java.util.Scanner(System.in); //sets scanner to kb
    int firstNum, secondNum, product;

    System.out.println("Enter first number you want to multiply: ");
    firstNum = scanner.nextInt();  //takes kb entered and assigns to firstNum

    System.out.println("Enter second number you want to multiply: ");
    secondNum = scanner.nextInt(); // takes kb entered and assigned to secondNum

    product = firstNum * secondNum;

    System.out.println("The product of " +firstNum+ " and " +secondNum+ " is " + product);
  }
}
