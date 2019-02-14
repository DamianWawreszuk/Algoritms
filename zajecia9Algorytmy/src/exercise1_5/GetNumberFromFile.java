package exercise1_5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GetNumberFromFile {
    public static void main(String[] args) throws IOException {
        int i = 0;
        double number = 0;

        //owtwiera nam plik
        File myFile = new File("C:/Users/ja/Downloads/zadanie1_5.txt");
        Scanner myScanner = new Scanner(myFile);

        //Czyta linie z pliku, dopóki nie będzie już więcej niczego w pliku
        while (myScanner.hasNextDouble()){
            //czyta linijki
            number = number + myScanner.nextDouble();
            i++;
            System.out.println(number);
        }
        //wyświetla ostatnią linijkę.
        System.out.println("Wyświetl wynik po sumowaniu: " + number);

        // wychodzi z pliku.
        myScanner.close();
        }
    }

