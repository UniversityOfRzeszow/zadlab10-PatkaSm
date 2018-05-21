/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class WprowadzZKonsoli {
    
    static void wpiszInt(){
        System.out.println("Wpisz liczbę całkowitą: ");
        Scanner input = new Scanner(System.in);
       try { 
            int a = input.nextInt();
            FileReader fr = new FileReader("File.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            
            FileWriter fwo = new FileWriter("File.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(a);
            bwo.newLine();
            bwo.close();
            }
       catch (IOException e){
           System.out.println(e.toString());
       }

    }
    static void wpiszString(){
        System.out.println("Wpisz tekst: ");
        Scanner input = new Scanner(System.in);
       try { 
            String a =input.nextLine();
            FileReader fr = new FileReader("File.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            
            FileWriter fwo = new FileWriter("File.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(a);
            bwo.newLine();
            bwo.close();
            }
       catch (IOException e){
           System.out.println(e.toString());
       }
    }
       
    static void wpiszChar(){
       System.out.println("Wpisz znak: ");
       Scanner input = new Scanner(System.in);
       try { 
            char a = input.next().charAt(0);
            FileReader fr = new FileReader("File.txt");
            BufferedReader br = new BufferedReader(fr); 
            String output = br.readLine();
            br.close();
            
            FileWriter fwo = new FileWriter("File.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(a);
            bwo.newLine();
            bwo.close();
       }
       catch (IOException e){
           System.out.println(e.toString());
       }
    }
       
    static void wpiszFloat(){
        Scanner input = new Scanner(System.in);
       try { 
            Float a =input.nextFloat();
            FileReader fr = new FileReader("File.txt");
            BufferedReader br = new BufferedReader(fr); 
            String output = br.readLine();
            br.close();
            
            FileWriter fwo = new FileWriter("File.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write((int) (float) a);
            bwo.newLine();
            bwo.close();
       }
       catch (IOException e){
           System.out.println(e.toString());
       }
       
    }
}
