
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
class XENTASK {
    
    ArrayList X = new ArrayList();
    ArrayList Y = new ArrayList();
    
    public void addX(int a){
        X.add(a);
    }
    
    public void addY(int a){
        Y.add(a);
    }
    
    public void clear(){
        X.clear();
        Y.clear();
    }
    
    public int findmin(int N){
        int total1 = 0;
        int total2 = 0;
        for (int i = 0; i<N; i++){
            if (i%2 == 0){
                total1 = total1 + (int)X.get(i);
            }
            else
                total1 = total1 + (int)Y.get(i);
        }
        for (int i = 0; i<N; i++){
            if (i%2 == 0){
                total2 = total2 + (int)Y.get(i);
            }
            else
                total2 = total2 + (int)X.get(i);
        }
        if (total1 < total2){
            return total1;
        }
        else {
            return total2;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        XENTASK three = new XENTASK();
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int j = 0; j<testCase; j++){
            three.clear();
            int N = sc.nextInt();
            for (int i = 0; i<N; i++){
                three.addX(sc.nextInt());
            }
            for (int i = 0; i<N; i++){
                three.addY(sc.nextInt());
            }
            System.out.println(three.findmin(N));
        }
    }
}
