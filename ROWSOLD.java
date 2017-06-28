
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
class ROWSOLD {
    
    public long solve(String word){
        long onect = 0;
        long zeroct = 0;
        long time = 0;
        int j = 0;
        for (j = 0; j<word.length(); j++){
            if (word.charAt(j) == '1'){
                break;
            }
        }
        for (; j<word.length(); j++){
            if (word.charAt(j) == '1'){
                if (zeroct>0){
                    time = time+(zeroct+1)*onect;
                    zeroct = 0;
                }
                onect++;
            }
            if (word.charAt(j) == '0'){
                zeroct++;
            }
        }
        if (zeroct>0){
            time = time+(zeroct+1)*onect;
            zeroct = 0;
        }
        return time;
    }
    
    public static void main(String[] args) {
        ROWSOLD rows = new ROWSOLD();
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for (int i = 0; i<TC; i++){
            String word = sc.next();
            System.out.println(rows.solve(word));
        }
    }   
}
