
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
class Codecheftwo {
    
    Scanner sc = new Scanner(System.in);
        
    public boolean query(int x, int y){
        System.out.println("? " + x + " " + y);
        String s = sc.next();
        if (s.equals("YES"))
            return true;
        else 
            return false;
    }
    
    public int findX(int min, int max, int y){
        if (max-min <= 1){
            return min;
        }
        int mid = (min+max)/2;
        if (query(mid, y)){
            return findX(mid, max, y);
        }
        else
            return findX(min, mid, y);
    }
    
    public int findY(int x, int min, int max){
        if (max-min <= 1){
            return min;
        }
        int mid = (min+max)/2;
        if (query(x, mid)){
            return findY(x, mid, max);
        }
        else
            return findY(x, min, mid);
    }
            
    public static void main(String[] args) {
        Codecheftwo code = new Codecheftwo();
        int squareside = code.findX(1, 500, 0);
        int trianglebase = code.findX(squareside+1, 1001, squareside*2);
        int height = code.findY(0, squareside*2+1, 1001);
        int area = (squareside*squareside)*4+(height-(squareside*2))*trianglebase;
        System.out.println("! " + area);
    }
}
