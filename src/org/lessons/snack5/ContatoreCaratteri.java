package org.lessons.snack5;

import java.util.Scanner;

public class ContatoreCaratteri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Loop
        while(true) {
            //richiesta all'utente
            System.out.print("Inserisci una stringa o 0 per terminare: ");
            String input = scanner.nextLine();

            //controllo
            if (input.equals("0")) {
                System.out.println("Terminato");
                break;
            }

            //conteggio dei caratteri
            int alphabeticCount = 0;
            int numericCount = 0;
            int nonAlphanumericCount = 0;

            for (int i=0; i < input.length(); i++){
                char carattere = input.charAt(i);
                if (Character.isLetter(carattere)){
                    alphabeticCount++;
                } else if (Character.isDigit(carattere)) {
                    numericCount++;
                } else {
                    nonAlphanumericCount++;
                }
            }

            //stammpa risultati

            System.out.println("Caratteri alfabetici: " +alphabeticCount);
            System.out.println("Caratteri numerici: " +numericCount);
            System.out.println("Simboli: " +nonAlphanumericCount);
        }

    }
}
