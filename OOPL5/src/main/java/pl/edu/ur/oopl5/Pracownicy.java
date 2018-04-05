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
public class Pracownicy extends Firma{
    
    public String imie;
    public String nazwisko;
    public int wiek;
    Scanner scanner = new Scanner(System.in);
    
    public Pracownicy(String imie,String nazwisko,int wiek){
        this.imie = "";
        this.nazwisko = "";
        this.wiek = 33;
    }
    
    void pobierz(){
        System.out.println("Podaj imie pracownika");
        imie = scanner.nextLine();
        System.out.println("Podaj nazwisko pracownika");
        nazwisko = scanner.nextLine();
        System.out.println("Podaj wiek pracownika");
        wiek = scanner.nextInt();
        System.out.println("Ustal zarobki pracownika");
        zarobki = scanner.nextInt();
    }
    
    void wyswietl(){
        System.out.println("Imie pracownika " +imie);
        System.out.println("Nazwisko pracownika "+nazwisko);
        System.out.println("Wiek pracownika "+wiek);
    }
    
}
