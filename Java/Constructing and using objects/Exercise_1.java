import java.util.*;

   public class Exercise_1 {

      public static int bootCamp(int num1, int num2) {

        if (num1<num2) {
          return (int) (Math.sqrt((Math.abs(num1-num2))));
        }
        else {
          return(num1+num2);
        }
      }

      public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = reader.nextInt();
        System.out.println("Enter another number");
        int num2 = reader.nextInt();
        System.out.println("The result is: " + bootCamp(num1, num2));


      }
   }
