package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO zad 3, 5, 6
        Scanner scanner = new Scanner(System.in);
        int zad;
        System.out.println("Wybierz nr zadania: 3, 5, 6");
        zad = scanner.nextInt();
        switch(zad){
            case 3:{
                Stos stos = new Stos();
                int zad3;
                do 
                {    
                 System.out.println("1.Dodaj liczbe\n2.Usun liczbe\n3.Wyswietl stos\n4.Zakoncz program");
                 zad3 = scanner.nextInt();
                 switch(zad3)
                 {
                     case 1:
                     stos.push();
                     break;
                     case 2:
                     stos.pop();
                     break;
                     case 3:
                     stos.wyswietlstos();
                     break;
                 }
                }
                while(zad3!=4);
                break;
            }
            case 5:{
                int a,b;
                Pracownicy[] pracownik = new Pracownicy[100];
                Firma firma = new Firma();
                System.out.println("Podaj ilu pracownikow chcesz dodac:");
                a = scanner.nextInt();
                for (int i=0;i<a;i++)
                {
                    pracownik[i] = new Pracownicy("","",30);
                    System.out.println("Pracownik nr: "+(i+1));
                    pracownik[i].pobierz();
                }
                System.out.println("Podaj ilu pracownikow chcesz wyswietlic (max: "+a+")");
                b = scanner.nextInt();
                for (int i=0;i<b;i++)
                {
                    System.out.println("Pracownik: "+(i+1));
                    pracownik[i].wyswietl();
                }
                break;
            }
            case 6:{
                int g;
                Liczba l1 = new Liczba(10);
                l1.uzupelnij();
                System.out.print("Przez jaka liczbe pomonozyc: ");
                g = scanner.nextInt();
                g*=l1.liczba;
                System.out.println("Silnia z twojej liczby to: "+l1.silnia(g));
                l1.wypisz();
                break;
            }
            default:{
                System.out.println("nie ma takiego zadania");
                break;
            }
        }
    }
}
