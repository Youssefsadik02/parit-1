package fr.dampierre;

import java.util.Scanner;

public class App {
    
   
     public static void main(String[] args) {
         Scanner clavier =new Scanner (System.in);   
          System.out.print("Entrez un nombre: ");
         int entier= clavier.nextInt();
         clavier.close();
         System.out.println(entier +" est "+demanderEntierEtAfficherParite(entier));
    }
    public static String demanderEntierEtAfficherParite(int entier){
          
        String parite="";
        if (entier%2==0){
            parite="pair";
         }
        else {
            parite="impair";
            
        }
        return parite;
    }
    
}
