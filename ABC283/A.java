package ABC283;

import java.util.*;

public class A {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        final int n = 2;
        int[] numArray = new int[n];
        for(int i=0;i<n;i++){
            numArray[i] = Integer.parseInt(scanner.next());
        }
        int result = (int)Math.pow(numArray[0],numArray[1]);
        System.out.println(result);
        scanner.close();
    }
    
}