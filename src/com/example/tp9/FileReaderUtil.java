
package com.example.tp9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtil {

    public void readFile(String filePath) throws IOException {

        try (BufferedReader reader =
                 new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println(
                "Erreur lors de la lecture : " + e.getMessage()
            );
        }
    }

    public void readFileSafely(String filePath) {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {

            System.err.println(
                "Erreur lors de la lecture : " + e.getMessage()
            );

        } finally {

            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println(
                    "Erreur de fermeture : " + e.getMessage()
                );
            }
        }
    }

    public void readFileModern(String filePath) {

        try (BufferedReader reader =
                 new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {

            System.err.println(
                "Erreur d'E/S avec le fichier : " + e.getMessage()
            );
        }
    }
}
