
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
class BRLADDER {
    
    public boolean compare(int n, int m){
        if (n == m+2 || m == n+2){
            return true;
        }
        if ((n%2 == 1 && n+1 == m) || m%2 == 1 && m+1 == n){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        BRLADDER ladder = new BRLADDER();
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for (int j = 0; j<TC; j++){
            if (ladder.compare(sc.nextInt(), sc.nextInt()) == true){
                System.out.println("YES");
            }
            else 
                System.out.println("NO");
        }
    }
}
