package ba.unsa.etf.rpr.tut1;

import java.util.Scanner;

public class Main {
    public static int sumaCifara(int broj){
        int temp = broj, suma = 0;
        do{
            suma += temp % 10;
            temp /= 10;
        }while(temp > 0);
        return suma;
    }

    public static void main(String[] args) {
        System.out.print("Unesite broj n: ");
	    Scanner ulaz = new Scanner(System.in);
	    int n = ulaz.nextInt();
	    System.out.println("Brojevi od 1 do n koji su djeljivi sa sumom svojih cifara su: ");
	    for(int i = 1; i <= n; i++) {
            if (i % sumaCifara(i) == 0) System.out.println(i);
        }
    }
}
