
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
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
class DISHLIFE {
    
    List<int[]> Islands = new ArrayList<>();
    HashSet hash = new HashSet();
    
    public void put(int a){
        hash.add(a);
    }
    
    public void clear(){
        hash.clear();
    }
    
    public boolean compare(int num){
        if (hash.size() == num){
            return true;
        }
        return false;
    }
    
    public void solve(int num){
        Comparator<int[]> c = (t1, t2) -> t2.length - t1.length;
        Collections.sort(Islands, c);
        for (int n = 0; n<Islands.size(); n++) {
            for (int ingreds: Islands.get(n)){
                put(ingreds);
            }
            if (compare(num)){
                if (n == Islands.size()-1)
                    System.out.println("all");
                else
                    System.out.println("some");
                return;
            }
        }
        System.out.println("sad");
        clear();
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for (int i = 0; i<TC; i++){
            DISHLIFE dish = new DISHLIFE();
            int islands = sc.nextInt(); //number of islands
            int num = sc.nextInt();  //total number of ingredients needed
            for (int j = 0; j<islands; j++){
                int numingred = sc.nextInt();  //number of ingredients at that island
                int[] ingred = new int[numingred];
                for (int m = 0; m<numingred; m++){
                    ingred[m] = sc.nextInt();
                }
                dish.Islands.add(ingred);   
            }
            dish.solve(num);
        }
    }
}
