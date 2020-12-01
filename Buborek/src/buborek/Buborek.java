package buborek;
import java.math.*;
import java.util.Scanner;

public class Buborek {

    
    public static void main(String[] args) {
        System.out.println("\nSORBARENDEZÉS TÉTELE (buborék rendezés)\n");
        System.out.println("Hány Elemű leygen a tömb?");
        Scanner bemenet = new Scanner(System.in);
        int elemSzam = bemenet.nextInt();
        int[] szamok = new int[elemSzam];
        
        for (int i = 0; i < elemSzam; i++) {
            szamok[i] = (int)(Math.random()*100)-50;
        }
        
        System.out.println("\nTömb elemei: ");
        for (int i = 0; i < elemSzam; i++) {
            System.out.println(szamok[i]+" ");
        }
        for (int i = 0; i < elemSzam-1; i++) {
            for (int j = 0; j < elemSzam-i-1; j++) {
                if (szamok[j] > szamok[j+1]) {
                    int temp = szamok[j];
                    szamok[j] = szamok[j+1];
                    szamok[j+1] = temp;
                }
            }
        }
        System.out.println("\nElrendezett tömb elemei: ");
        for (int i = 0; i < elemSzam; i++) {
            System.out.println(szamok[i]+" ");
        }
    }
    
}
