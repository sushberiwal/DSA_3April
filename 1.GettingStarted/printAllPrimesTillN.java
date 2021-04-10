import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        
        // iterate on all the values in between and including low and high
        for(int i=low ; i<=high ; i++){
            
            Boolean isPrime = true;
            // check prime or not ??
            for(int div = 2 ; div*div<=i ; div++){
                if(i % div == 0){
                    // do nothing
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime == true){
                System.out.println(i);
            }
        }
    }
}