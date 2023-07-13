package com.ferragnez.party;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        String[] nomiinvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
        int i=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci il tuo nome");
        String nome = scan.nextLine();
        Boolean ispresent = false;

        ;
       while (i !=nomiinvitati.length && ispresent==false ) {
           if (nomiinvitati[i].equals(nome)) {
               ispresent = true;
           }i++;
       }
        if (ispresent==true) {
            System.out.println("puoi entrare");
        } else {
            System.out.println("non puoi entrare");
        }
    }

}











