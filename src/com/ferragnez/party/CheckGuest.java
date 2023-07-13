package com.ferragnez.party;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        String[] nomiinvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci il tuo nome");
        String nome = scan.nextLine();
        Boolean ispresent = false;

        for (int i = 0; i < nomiinvitati.length; i++) {
            if (nomiinvitati[i].equals(nome)) {
                ispresent = true;
            }
        }
        if (ispresent == true) {
            System.out.println("puoi entrare");
        } else {
            System.out.println("non puoi entrare");
        }

    }
}











