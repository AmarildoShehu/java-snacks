package org.lessons.snack2;

import java.util.Random;

public class RandomNameGenerator {
    public static void main(String[] args) {

        String[] guestName = { "Amarildo","John","Steven","Brandon","Dio" };
        String[] guestSurname = {"Shehu","Cena","Gerrard","Bo","Steve"};

        //geeratore num casuali
        Random random = new Random();

        //num inviti
        int numberOfGuest = 10;
        System.out.println("lista degli invitati");

        //logica inviti falsi
        for (int i = 0; i < numberOfGuest; i++){
            String randomName = guestName[random.nextInt(guestName.length)];
            String randomSurname = guestSurname[random.nextInt(guestSurname.length)];
            System.out.println(randomName +" "+randomSurname);
        }
    }
}
