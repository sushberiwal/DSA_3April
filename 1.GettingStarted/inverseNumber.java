import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here 
  Scanner scn = new Scanner(System.in);
  int originalValue = scn.nextInt();
  
  int inverseValue = 0;
  int inverseValueDigit = 1;
  
  while(originalValue != 0){
  int positionOfInverseDigit = originalValue % 10;
  inverseValue = inverseValue+inverseValueDigit*(int)Math.pow(10 , positionOfInverseDigit-1);
  inverseValueDigit++;
  originalValue = originalValue/10;
  }
  System.out.println(inverseValue);
 }
}