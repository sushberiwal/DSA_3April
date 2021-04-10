import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int spaces = n-1;
        int stars = 1;
        
        for(int i=1 ; i<=n ; i++){
            // space loop
            for(int j = 1 ; j<=spaces ; j++){
                System.out.print("\t");
            }
            // stars loop
            for(int k=1 ; k<=stars ; k++){
             System.out.print("*\t");   
            }
            spaces--;
            stars++;
            System.out.println();
        }

    }
}