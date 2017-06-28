/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codejam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Codejam {

    public long combination(String word){
        Set<Character> set = new HashSet<>();
        long combo = 1;
        for (int i=0; i<word.length(); i++){
            set.clear();
            set.add(word.charAt(i));
            if (i==0){
                set.add(word.charAt(i+1));
            }
            else if (i==(word.length()-1)){
                set.add(word.charAt(i-1));
            }
            else {
            set.add(word.charAt(i+1));
            set.add(word.charAt(i-1));
            }
            combo = combo*set.size();
        }
        return combo;
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Codejam codejam = new Codejam();
        String line = new String("");
        System.out.println("Case #1:" + codejam.combination("abcde"));
         // open input stream test.txt for reading purpose.
  /*      try (BufferedReader br = new BufferedReader(new FileReader("A-small-practice.in"))){
           while ((line = br.readLine()) != null) {
            System.out.println("Case #1:" + codejam.combination(line));
           }       
         
        } catch (IOException ex) {
            Logger.getLogger(Codejam.class.getName()).log(Level.SEVERE, null, ex);
        }
   */
    
    }
}
    

