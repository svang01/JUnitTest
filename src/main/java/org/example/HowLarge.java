package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> MyArray = new ArrayList<>();

        while(true) {
            System.out.println("Enter a string or press enter to exit.");
            String word = scanner.nextLine();
            if (word.equals("")) {
                break;
            } else {
                MyArray.add(word);
            }
        }

        System.out.println("The total amount of items in the list was: " + MyArray.size());

    }
}