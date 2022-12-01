
/**
 * Write a description of class leapyear here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class leapyear
{
    public static  boolean isLeapyear(int year){
   if (year % 4 == 0){
     return true;
     }
   else if (year % 100 != 0){
     return true;
     }
   else if (year % 400 == 0){
     return true;
     }
   return false;
 }
 }


