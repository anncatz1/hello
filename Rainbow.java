
import java.lang.reflect.Array;
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
class Rainbow {
    
    int[][] array = new int[5][5];
    
    public void create(int num){
        HashSet set = new HashSet();
        int count = 0;
        while (count == 0){
            for (int i = 0; i<num; i++){
                for (int m = 0; m<num; m++){
                    if (array[i][m] == 0)
                        break;
                    else 
                        set.add(array[i][m]);
                }
                if (set.size() == 1){
                    count++;
                    for (int m = 0; m<num; m++){
                    if (array[i][m] == 0)
                        break;
                    else 
                        array[i][m] = 0;
                    }
                }
            }
            System.out.println(count);
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Rainbow rainbow = new Rainbow();
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for (int j = 0; j<TC; j++){
            int num = sc.nextInt();
            int[][] array = new int[num][num];
            for (int i = 0; i<num; i++){
                for (int m = 0; m<num; m++){
                    array[i][m] = sc.nextInt();
                }
            }
        }
    }
}
