class Main {
 public static void main(String[]args){
   Triangle(5);
 }
  
  public static void square(int s){
   for(int row=0; row<s; row++){
     for(int col=0; col<s; col++){
       System.out.print("* ");
     }
     System.out.println();
}
 
  }
  public static void rectangle(int l, int w){
   for(int row=0; row<w; row++){
     for(int col=0; col<l; col++){
       System.out.print("* ");
     }
     System.out.println();
}
 
  }
  public static void RightTriangle(int s){
    int p = 0;
   for(int row=0; row<=s; row++){
      for(int col=0; col<=p; col++){
       System.out.print("* ");
     }
     System.out.println();
     p += 1;
}
 
  }
  public static void Triangle(int s){
    int p = 0;
    int p2 = s;
     for(int row=0; row<=s; row++){
       for(int sp=0; sp<=p2; sp++){
       System.out.print("* ");
      for(int col=0; col<=p; col++){
       System.out.print("* ");
     }
     System.out.println();
     p += 1;
     p2 -= 1;
}
 
  }
}
