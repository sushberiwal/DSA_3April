import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn = new Scanner(System.in);
      
      int n = scn.nextInt(); // 5
      
      int a = 0;
      int b = 1;
      System.out.println(a);
      System.out.println(b);
      
      for(int i=0 ; i<n-2 ; i++){  // 3
          int sum = a+b;
          System.out.println(sum);
          a = b;
          b = sum;
      }
   }
  }