
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
class ChefFeast {
    
    ArrayList<Integer> num = new ArrayList<>();
    
    public void add(int b){
        num.add(b);
    }
    
    public void solve(){
        Collections.sort(num, Comparator.reverseOrder());
        long happy = 0;
        long sum = 0;
        int count = 0;
        for (int m = 0; m<num.size(); m++){
            if (num.get(m) >=0){
                sum += num.get(m);
                count++;
            }
            else {
                happy = happy + num.get(m);
            }
        }
        long poshappy = 0; 
        boolean done = false;
        poshappy = sum*count;
        for (int m = 0; m<num.size(); m++){
            if (num.get(m) <0){
                if (count>0 && done == false){
                    long sum2 = sum+num.get(m);
                    int count2 = count + 1;
                    long happy2 = sum2*count2;
                    long happy3 = poshappy+num.get(m);
                    if (happy2 > happy3){
                        sum = sum+num.get(m);
                        count++;
                        poshappy = sum*count; 
                    }
                    else {
                        poshappy = poshappy + num.get(m);
                        done = true;
                    }
                }
                else {
                        poshappy = poshappy + num.get(m);
                }                
            }            
        }          
        System.out.println(poshappy);
        //System.out.println("PosHappy with negatives: " + poshappy);
        //return happy3;
    }
    static void test()
    {
        ChefFeast chef = new ChefFeast();
        chef.add(0);
        chef.add(-1);
        chef.solve();
        ChefFeast chef2 = new ChefFeast();
        chef2.add(1000000000);
        chef2.add(2);
        chef2.add(0);
        chef2.add(-1);
        chef2.solve();
        chef2 = new ChefFeast();
        chef2.add(-2);
        chef2.add(-4);
        chef2.add(-3);
        chef2.solve();
    }
        
    public static void main(String[] args) {
        
        //test();
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for (int i = 0; i<TC; i++){
            ChefFeast chef = new ChefFeast();
            int n = sc.nextInt();
            for (int j = 0; j<n; j++){                
                chef.add(sc.nextInt());
            }
            chef.solve();
        }
    }
}
