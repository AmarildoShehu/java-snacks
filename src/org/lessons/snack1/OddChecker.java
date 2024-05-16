package org.lessons.snack1;

import java.util.Scanner;

public class OddChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Richiesta di inserire un num
        System.out.print("inserisi un numero: ");
        int num = scanner.nextInt();

        //verifica se il num e pari o dispari
        if (num % 2 == 0) {
            System.out.println("il num e pari");
        } else {
            System.out.println("il num e dispari, il num successivo e' "
            + (num+1));
        }

        scanner.close();
    }
}
