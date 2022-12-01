public class DivBy3
{
    public static void main(String[] args) {
        System.out.print(div(3));
        System.out.print(div(20));
        System.out.print(div(50));
        System.out.print(div(21));
    }
    public static boolean div(int a){
        int result = 0;
        while (a % 10 > 10){
            result += a%10;
            a = a%10;
        }
        result += a;
        if (result % 3 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
