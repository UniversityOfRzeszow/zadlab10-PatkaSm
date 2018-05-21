package pl.edu.ur.oopl10;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrycja
 */
public class Zadanie4 {
    public static double iloraz(int a, int b){
      return a/b;
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iloscWyjatkow = 0;
        boolean off = false;
         Random generator = new Random();
         while(off!=true)
        {
            if(iloscWyjatkow>=3)
            {
                off=true;
            }
            else
            {
                int a = generator.nextInt(21)-10;
                int b= generator.nextInt(21)-10;
                System.out.print("\n"+a + " / " + b + " = ");
                
                try{
                    System.out.println(""+ iloraz(a,b));
                }
                catch(ArithmeticException e){
                    System.out.println(e.toString());
                    iloscWyjatkow++;
                }
               
            }
        }
    }
}
