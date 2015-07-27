import java.io.IOException;

public class AddFunction {
   
   public static void main(String []args) throws IOException {
      // Call add with parameters 5 and 6
      // then print the returned sum
      int sum1 = add(5, 6);
      System.out.println("Sum 1: " + sum1);
      
      // Call add with parameters 10 and 20
      // then print the returned sum
      int sum2 = add(10, 20);
      System.out.println("Sum 2: " + sum2);
      
      // Call add with 50 and 70 below this line
      // then print the returned value


       // Below this line read in two values from the user
       // and add them together
   }
   
   public static int add(int x, int y) {
      int sum = x + y;
      return sum;
   }
}