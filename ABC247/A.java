package ABC247;

import java.util.*;

public class A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        boolean[] flag = new boolean[4];

        for(int i=0;i<4;i++){
            flag[i] = true;
        }

        for(int i=0;i<4;i++){
            if(S.charAt(i)=='0'){
                flag[i] = false;
            }
        }

        for(int i=3;i>=0;i--){
            if(flag[i]&&i==3){
                flag[i] = false;
            }else if(flag[i]){
                flag[i+1] = true;
                flag[i] = false;
            }
        }

        for(int i=0;i<4;i++){
            if(flag[i]){
                System.out.print(1);
            }else{
                System.out.print(0);
            }
        }

        sc.close();
    }
}
