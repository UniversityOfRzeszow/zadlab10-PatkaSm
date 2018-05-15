package pl.edu.ur.oopl10;

import java.util.Scanner;

/**
 *
 * @author mchla
 */
public class Main {

    public static void main(String[] args) {
        int[] tablica = {10, 20, 30, 40, 50};
        Scanner input = new Scanner(System.in);
        
        System.out.println("Który element tablicy wyświetlić?");
        int index = input.nextInt();
        try {
            System.out.println(tablica[index]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Podałeś indeks wykraczający poza rozmiar tablicy");
        }

    }
    
    }
    
