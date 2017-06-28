
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
class marchROBOTG2 {
    
    public boolean inc(String s, int rows, int cols){
        int i = 0;
        int j = 0;
        int imin = 0;
        int imax = 0;
        int jmin = 0;
        int jmax = 0;
        for (int m = 0; m<s.length(); m++){
            switch (s.charAt(m)){
                case 'R': i++;
                          break;
                case 'L': i--;
                          break;
                case 'U': j--;
                          break;
                case 'D': j++;
                          break;
            }
            if (i < imin){
                imin = i;
            }
            if (i > imax){
                imax = i;
            }
            if (j < jmin){
                jmin = j;
            }
            if (j > jmax){
                jmax = j;
            }
        }
        if (imax-imin >= cols){
            return false;
        }
        if (jmax-jmin >= rows){
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        marchROBOTG2 three = new marchROBOTG2();
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for (int j = 0; j<TC; j++){
            int rows = sc.nextInt();
            int col = sc.nextInt();
            String s = sc.nextLine();
            if (s.isEmpty()){
                s = sc.nextLine();
            }
            if (three.inc(s, rows, col)){
                System.out.println("safe");
            }
            else
                System.out.println("unsafe");
        }
    }
}
