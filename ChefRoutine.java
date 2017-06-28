
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
class ChefRoutine {
    
    public static boolean solve(String num){
        for (int i = 1; i<num.length(); i++){
            switch (num.charAt(i-1)){
                case 'C': 
                    if (num.charAt(i) != 'C' && num.charAt(i) != 'E' && num.charAt(i) != 'S')
                        return false;
                    else
                        break;
                case 'E': 
                    if (num.charAt(i) != 'E' && num.charAt(i) != 'S')
                        return false;
                    else
                        break;
                case 'S': 
                    if (num.charAt(i) != 'S')
                        return false;
                    else
                        break;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        ChefRoutine chef = new ChefRoutine();
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for (int i = 0; i<TC; i++){
            if(solve(sc.next())){
                System.out.println("yes");
            }
            else
                System.out.println("no");
        }
    }  
}
