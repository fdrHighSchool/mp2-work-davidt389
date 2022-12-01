
public class countquarters
{
   public static int CountQuarters(int a){
       int quarter = 0;
       quarter = (a %100)%25;
       return quarter;
   }
}
