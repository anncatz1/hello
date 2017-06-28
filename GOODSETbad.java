
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
class GOODSETbad {
    
    public void solve(int n){
        long a = 1;
        long b = 2; 
        if (n == 1){
            System.out.print(a);
            System.out.println();
        }
        else if (n == 2){
            System.out.print(a+" ");
            System.out.print(b);
            System.out.println();
        }
        else if (n>2){
            System.out.print(a+" ");
            System.out.print(b+" ");
            for (int i = 0; i<n-2; i++){
                long m = a+b;
                m = m+1;
                System.out.print(m+" ");
                a=b;
                b=m;
            }
            System.out.println();
        }       
    }
    
    public static void main(String[] args) {
        GOODSETbad set = new GOODSETbad();
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for (int i = 0; i<TC; i++){
            int n = sc.nextInt();
            set.solve(n);
        }
    }
}
