import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int temp = n;
      int length=0;
      while(temp != 0){
          temp = temp/10;
          length++;
      }
      // length is updated !!!
      while( length != 0  ){
          int digit = n / (int)Math.pow(10 , length-1);
          System.out.println(digit);
          n = n % (int)Math.pow(10 , length-1);
          length--;
      }
     }
    }