
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
class Snakeunfin {
    
    public void solve(String word){
        int mon = 0;
        int snake = 0;
        StringBuilder newword = new StringBuilder(word);
        for (int i = 0; i<newword.length(); i++){
            if (newword.charAt(i) == 'm'){
                if (i>0){
                    if (newword.charAt(i-1) == 's'){
                        newword.setCharAt(i-1, '*');
                        continue;
                    }
                }
                if (i<newword.length()-1){
                    if (newword.charAt(i+1) == 's'){
                        newword.setCharAt(i+1, '*');
                        continue;
                    }
                }
            }            
        }
        for (int i = 0; i<newword.length(); i++){
            if (newword.charAt(i) == 'm'){
                mon++;
            }
            if (newword.charAt(i) == 's'){
                snake++;
            }
        }
        //System.out.println(newword + " mon: " + mon + " snakes: " + snake);
        if (mon>snake){
            System.out.println("mongooses");
        }
        else if (mon==snake){
            System.out.println("tie");
        }
        else {
            System.out.println("snakes");
        }
    }
    
    static void test()
    {
        Snakeunfin snak = new Snakeunfin();
        snak.solve("mssmss");
    }
    
    public static void main(String[] args) {
        Snakeunfin snake = new Snakeunfin();
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for (int i = 0; i<TC; i++){
            String word = sc.next();
            snake.solve(word);
        }
    }   
}
