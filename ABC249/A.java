package ABC249;

import java.util.*;

public class A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int x = scanner.nextInt();
        int totalT = 0;
        int totalA = 0;

        for(int i=0;i<x;++i){
            if(i%(a+c)<a){
                totalT += b;
            }
            if(i%(d+f)<d){
                totalA += e;
            }
        }
        if(totalT>totalA){
            System.out.println("Takahashi");
        }else if(totalA>totalT){
            System.out.println("Aoki");
        }else{
            System.out.println("Draw");
        }

        scanner.close();
    }
}
