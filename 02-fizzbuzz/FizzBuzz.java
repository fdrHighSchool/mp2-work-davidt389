
/**
 * Write a description of class FizzBuzz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class FizzBuzz
{
    public static void main(String[]args){
      for (int i = 1; i < 101; i++){
          System.out.println(fizzbuzz(i));
      }
  }
  public static String fizzbuzz(int a){
      String result = "";
      if (a % 3 == 0){
          result += "Fizz";
      }
      if (a % 5 == 0){
          result += "Buzz";
      }
      
      // NOT DIVISIBLE BY BOTH --> NOT DIVISIBLE BY EITHER
      
      /*
        if (a % 3 != 0 && a % 5 != 0) {
          result += a;
        }
       */
      return result;
  }
}
