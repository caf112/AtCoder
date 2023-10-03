package ABC245;

import java.util.*;

public class A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        if(A<C){
            System.out.println("Takahashi");
        }else if(A==C && B<D){
            System.out.println("Takahashi");
        }else if(A==C && B==D){
            System.out.println("Takahashi");
        }else{
            System.out.println("Aoki");
        }

        sc.close();
    }
}
