
package com.example.tp9;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {


        System.out.println("EXERCICE 1 ");

        Calculator calc = new Calculator();

        System.out.println(" Addition ");

        System.out.println("5 + 3 = " + calc.add(5, 3));

        System.out.println("Division valide ");

        try {

            System.out.println("10 / 2 = " + calc.divide(10, 2));

        } catch (IllegalArgumentException e) {

            System.err.println(e.getMessage());

            LoggerUtil.logError(e.getMessage());
        }

        System.out.println(" Division par zéro ");

        try {

            System.out.println("10 / 0 = " + calc.divide(10, 0));

        } catch (IllegalArgumentException e) {

            System.err.println(
                "Erreur interceptée : " + e.getMessage()
            );

            LoggerUtil.logError(e.getMessage());
        }



        System.out.println(" EXERCICE 2 ");

        FileReaderUtil fileReader = new FileReaderUtil();

        System.out.println(" Lecture avec throws ");

        try {

            fileReader.readFile("test.txt");

        } catch (IOException e) {

            System.err.println(
                "Erreur de lecture : " + e.getMessage()
            );

            LoggerUtil.logError(e.getMessage());
        }

        System.out.println("Lecture avec finally ");

        fileReader.readFileSafely("test.txt");

        System.out.println("Lecture avec try-with-resources ");

        fileReader.readFileModern("test.txt");



        System.out.println("EXERCICE 3");

        try {

            User user1 = new User("Maryam", 20);

            System.out.println("Utilisateur créé avec succès !");
            System.out.println("Nom : " + user1.getUsername());
            System.out.println("Age : " + user1.getAge());

        } catch (InvalidUserException e) {

            System.err.println(
                "Erreur utilisateur : " + e.getMessage()
            );

            LoggerUtil.logError(e.getMessage());
        }

        System.out.println(" Test utilisateur invalide ");

        try {

            User user2 = new User("", 150);

            System.out.println(
                "Utilisateur : " + user2.getUsername()
            );

        } catch (InvalidUserException e) {

            System.err.println(
                "Erreur utilisateur : " + e.getMessage()
            );

            LoggerUtil.logError(e.getMessage());
        }



        System.out.println("EXERCICE 4 ");

        LoggerUtil.logError("Test de journalisation.");

        LoggerUtil.logError("Une erreur de test est enregistrée.");

        System.out.println(
            "Les erreurs ont été enregistrées dans error.log"
        );


      

        System.out.println(" FIN  ");
    }
}
