import java.util.*;

public class A {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int R = scanner.nextInt();
        int C = scanner.nextInt();

        int ans = 0;

        if(R-1>=1){
            ans++;
        }
        if(R+1<=H){
            ans++;
        }
        if(C-1>=1){
            ans++;
        }
        if(C+1<=W){
            ans++;
        }

        System.out.println(ans);

        scanner.close();
    }
}