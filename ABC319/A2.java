package ABC319;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> nameMap = new HashMap<>();
        nameMap.put("tourist", 3858);
        nameMap.put("ksun48", 3679);
        nameMap.put("Benq", 3658);
        nameMap.put("Um_nik", 3648);
        nameMap.put("apiad", 3638);
        nameMap.put("Stonefeang", 3630);
        nameMap.put("ecnerwala", 3613);
        nameMap.put("mnbvmar", 3555);
        nameMap.put("newbiedmy", 3516);
        nameMap.put("semiexp", 3481);

        String S = scanner.nextLine();
        Integer rate = nameMap.get(S);

        if(rate!=null){
            System.out.println(rate);
        }

        scanner.close();
    }
}
