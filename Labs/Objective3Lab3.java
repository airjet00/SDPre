public class Objective3Lab3{
  public static void main(String[] args){

    int first, second, third, sum;
    first = 1 + (int)(Math.random()*6);   //sets first random num
    second = 1 + (int)(Math.random()*6);  //sets second random num
    third = 1 + (int)(Math.random()*6);   //sets third random num
    sum = first + second + third;

    System.out.println(first+" + "+second+" + "+third+" = "+sum);

  }
}
