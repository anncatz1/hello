
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
class UnivCourses {
    
    ArrayList list = new ArrayList();
    
    public void add(int num){
        list.add(num);
    }
    
    public int find(){
        int max = 0;
        for (int m = 0; m<list.size(); m++){
            if ((int)list.get(m) > max){
                max = (int)list.get(m);
            }
        }
        int prereq = (int)list.size()-max;
        return prereq;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for (int i = 0; i<TC; i++){
            UnivCourses univ = new UnivCourses();
            int n = sc.nextInt();
            for (int j = 0; j<n; j++){
                int integer = sc.nextInt();
                univ.add(integer);
            }
            System.out.println(univ.find());
        }
    }  
}
