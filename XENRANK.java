
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
class XENRANK {
    
    public void series(int u, int v){
        int lastnum = u+v;
        System.out.println("lastnum: "+lastnum);
        int n = u+v;
        System.out.println("n: "+n);
        int sums = (lastnum+1)*n;
        int sums3 = sums/2;
        System.out.println("lastnum+1*n: "+sums+" total: " +sums3);
        
    }
    
    public long solve(long u, long v){
        long sum = (u+v+1)*(u+v);
        long sums = sum/2;
        long rank = sums+(u+1);
        System.out.println(rank);
        return rank;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for (int i = 0; i<TC; i++){
            XENRANK rank = new XENRANK();
            rank.solve(sc.nextInt(), sc.nextInt());
            
        }
    }
}
