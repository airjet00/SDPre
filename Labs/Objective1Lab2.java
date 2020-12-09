public class Objective1Lab2 {

  public static void main(String[] args) {
    String ANSI_RESET = "\u001B[0m";
    String ANSI_RED = "\u001B[31m";
    //String redLine = (ANSI_RED +"|"+ANSI_RED);
    System.out.println(" ---------------- ");
    System.out.println(ANSI_RED+"|"+ANSI_RESET+" Grocery List   "+ANSI_RED+"|");
    System.out.println("|"+ANSI_RESET+" 1. Milk        "+ANSI_RED+"|");
    System.out.println("|"+ANSI_RESET+" 2. Bread       "+ANSI_RED+"|");
    System.out.println("|"+ANSI_RESET+" 3. Eggs        "+ANSI_RED+"|");
    System.out.println(ANSI_RESET+" ---------------- ");

  }
}
