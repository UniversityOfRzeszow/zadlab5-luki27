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
public class Liczba {
    public int liczba;
    Scanner scanner = new Scanner(System.in);
    
    public Liczba(int liczba){
        this.liczba = liczba;
    }
    
    public int size(int liczba) {
        int licznik = 0;
        while (liczba / 10 != 0) {
            liczba = liczba / 10;
            licznik++;
        }
        return licznik;
    }
    int tab[] = new int[size(liczba)];
    
    void razklad(int liczba){
        int licznik = 0;
        for (int i = 0; i < size(liczba); i++) {
            tab[i] = liczba % 10;
            liczba = liczba / 10;
        }
    }
    
    void wypisz(){
        System.out.println("podana liczba: "+this.liczba);
    }
    
    void uzupelnij(){
        System.out.print("Podaj liczbe: ");
        this.liczba = scanner.nextInt();        
    }
    
    int silnia(int n){
        if (n<=1) 
            return 1;
        else 
            return n*silnia(n-1); 
    }
}
