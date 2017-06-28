
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
public class MarchEXTRAN {
    
    ArrayList list = new ArrayList();
    
    public void add(int num){
        list.add(num);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        MarchEXTRAN numbers = new MarchEXTRAN();
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for (int j = 0; j<TC; j++){
            int num = sc.nextInt();
            for (int i = 0; i<num; i++){
                numbers.add(num);
            }
        }
    }
}
