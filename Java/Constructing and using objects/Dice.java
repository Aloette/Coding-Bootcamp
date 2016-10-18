import java.util.*;

public class Dice {

  public static int rolls = 0;

    public static void Roll() {

      int num1 = (int) Math.ceil(Math.random()*6);
      int num2 = (int) Math.ceil(Math.random()*6);
      if ((num1==1) && (num2==1)) {
        System.out.println(rolls + " rolls were needed in order to have two 1s!");
      }
      else {
        rolls = rolls + 1;
        Roll();
      }
    }
    public static void main(String[] args) {
        Roll();
      }

}
