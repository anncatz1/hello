
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
class marchROBOTG {
    
    public boolean row(String s, int rows){
        int right = countOccurrences(s, 'R');
        int left = countOccurrences(s, 'L');
        if ((right + -left) >= rows || (right + -left) <= -rows){
            return false;
        }
        else
            return true;
    }
    
    public void count(String s, int rows){
        int r = 0;
        int l = 0;
        int u = 0;
        int d = 0;
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) == 'R'){
                r++;
            }
        }
    }
    
    public boolean col(String s, int cols){
        int up = countOccurrences(s, 'U');
        int down = countOccurrences(s, 'D');
        if ((up + -down) >= cols || (up + -down) <= -cols){
            return false;
        }
        else
            return true;
    }
    
    public int countOccurrences(String haystack, char needle){
    int count = 0;
    for (int i=0; i < haystack.length(); i++){
        if (haystack.charAt(i) == needle){
             count++;
        }
    }
    return count;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        marchROBOTG three = new marchROBOTG();
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for (int j = 0; j<TC; j++){
            int rows = sc.nextInt();
            int col = sc.nextInt();
            String s = sc.nextLine();
            if (s.isEmpty()){
                s = sc.nextLine();
            }
            if (three.row(s, col) == false || three.col(s, rows) == false){
                System.out.println("unsafe");
            }
            else
                System.out.println("safe");
        }
    }
}
