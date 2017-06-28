/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author student
 */
class Codechefone {
    ArrayList minites = new ArrayList();
    ArrayList dataUsed = new ArrayList();
    
    public void add(int a, int b){
        minites.add(a);
        dataUsed.add(b);
    }
    
    public int calc(int free, int N){
        int minfree = free;
        int othermin = N;
        int cost = 0;
        int m = 0;
        while (minfree > 0){
            minfree = minfree-(int)minites.get(m);
            m++;
        }
        if (minfree < 0){
            minfree = minfree*-1;
            cost = cost + minfree*(int)dataUsed.get(m-1);
        }
        for (int i = m; i<dataUsed.size(); i++){
            cost = cost + (int)dataUsed.get(i)*(int)minites.get(i);
        }
        minites.clear();
        dataUsed.clear();
        return cost;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Codechefone code = new Codechefone();
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for (int i = 0; i<TC; i++){
            int N = sc.nextInt();
            int free = sc.nextInt();
            for (int j = 0; j<N; j++){
                int min = sc.nextInt();
                int data = sc.nextInt();
                code.add(min, data);
            }
            System.out.println(code.calc(free, N));
        }
    }
}
