package org.lessons.snack3;

public class SommaPosizioneDispari {
    public static void main(String[] args) {

        //array num
        int[] numbers = {1,2,3,4,5,6,7,8,9,11,10};

        //variabile per la somma
        int sommaPosizioneDispari = 0;

        //calcolo somma degli elementi in posizione dispari
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                sommaPosizioneDispari += numbers[i];
            }
        }

        System.out.println("La somma degli elemnti e': " + sommaPosizioneDispari);
    }
}
