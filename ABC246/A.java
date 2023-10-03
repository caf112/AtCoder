package ABC246;

import java.util.*;

public class A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int X1 = sc.nextInt();
        int Y1 = sc.nextInt();
        int X2 = sc.nextInt();
        int Y2 = sc.nextInt();
        int X3 = sc.nextInt();
        int Y3 = sc.nextInt();

        int X = 0;
        int Y = 0;

        if(X1==X2){
            X = X3;
        }else if(X1==X3){
            X = X2;
        }else{
            X = X1;
        }

        if(Y1==Y2){
            Y = Y3;
        }else if(Y1==Y3){
            Y = Y2;
        }else{
            Y =Y1;
        }

        System.out.println(X);
        System.out.println(Y);

        sc.close();
    }
}
