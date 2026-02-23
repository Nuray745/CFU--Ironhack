package org.ironhack.exercise1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner (System.in)) {
            System.out.println("Please enter a phrase to be counted:");
            String line = scanner.nextLine();

            int count = 0;
            String[] words = line.split(" ");

            for(String word : words) {
                String lower = word.toLowerCase();
                if (lower.startsWith("a") || lower.startsWith("e") || lower.startsWith("i")
                        || lower.startsWith("o") || lower.startsWith("u")){
                    count ++;
                }else {
                    System.err.println("Word skipped: " + word);
                }
            }
            System.out.println("Words starting with a vowel: " + count);
        }
    }
}