/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;
import java.util.Scanner;
/**
 *
 * @author Luki
 */
public class Stos {
    public int wskStosu=0;
    public int[] tab = new int[6];
    Scanner scanner = new Scanner(System.in);
    
    void push(){
        if (wskStosu<5)
        {
            System.out.print("Podaj liczbe, ktora chcesz dodac na stos: ");
            wskStosu++;
            tab[wskStosu] = scanner.nextInt();
        }
        else
        {
            System.out.println("Stos pelny");
        }
    }   
    void pop(){
        if (wskStosu>=1)
        {
            System.out.println("Usuwam element ze stosu");
            wskStosu--;
        }
        else
        {
            System.out.println("Stos jest pusty");
        }
    }
    
    void wyswietlstos(){
        System.out.println("STOS: ");
        for (int i=wskStosu;i>=1;i--)
        {
            System.out.println(tab[i]);
        }
    }
    
}
