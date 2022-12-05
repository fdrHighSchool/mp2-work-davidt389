class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.print(countHi("hi"));
    System.out.print(remove("lol","l"));
  }
  public static int countHi(String str){
    int count = 0;
    for (int i = 0; i <= str.length()-2; i++){
      if (str.substring(i, i+2).equals("hi")){
        count++;
      }//end for if
    }//end for loop
    return count;
  }//end for method
public static String remove(String str1,String str2){
  loop(str1.indexOf(str2)!=-1){
    str1.sudstring(str1.indexOf(str2),str1.indexOf(str2)+1);
    }//end for loop
    return str1;
}
  public static String makeSarcaticastic(String a){
    String result = "";
    while (int i =0;i<a.length();i++){
      String b = a.substring(i,i+1);
      if(a.indexOf(b)%2 == 0){
        result += b.toUpperCase();
      }
      else{
        result += b;
      }
    }
     return result;
}
  public static String repeatEnd(String a, int b){
    String result = "";
    for(int r=0;r<=b;r++){
      result += a.substring(a.length()-b);
    }
    return result;
  }
  
}
