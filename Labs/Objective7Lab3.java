public class Objective7Lab3{
  public static void main(String[] args){
    int counter = 1;

    while(counter <= 20){               //loop while less than/equal than 20
      if (counter % 2 == 0){            //if even, else odd
        System.out.println(counter + " is even");
        counter++;
      }
      else{
        System.out.println(counter + " is odd");
        counter++;
      }
    }
  }
}
