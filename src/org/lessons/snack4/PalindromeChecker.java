package org.lessons.snack4;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci una stringa: ");
        String input = scanner.nextLine().toLowerCase();
        scanner.close();

        //Verifica della stringa con un booleano
        boolean isPolindrome = true;

        for (int i = 0; i < input.length()/2; i++){
            if (input.charAt(i) != input.charAt(input.length()-1 -i)) {
                isPolindrome = false;
                break;
            }
        }

        //stampa del risultato
        if (isPolindrome) {
            System.out.println("La stringa è palindroma");
        } else {
            System.out.println("La stringa non è palindroma");
        }

    }
}
