
import java.util.ArrayList;
import java.util.HashSet;
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
class GOODSET1 {
    
    HashSet set = new HashSet();
    ArrayList num = new ArrayList();
    
    public void solve(int n){
        int count = 1;
        for (int i = 1; i<=n; i++){
            while (set.contains(count)){
                count++;
            }
            for (int j = 0; j<num.size(); j++){
                set.add(count+(int)num.get(j));
            }
            num.add(count++);
        }
        for (int m = 0; m<n; m++){
            System.out.print(num.get(m)+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for (int i = 0; i<TC; i++){
            GOODSET1 set = new GOODSET1();
            int n = sc.nextInt();
            set.solve(n);
        }
    }
}
