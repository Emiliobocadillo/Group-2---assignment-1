package com.emil;

import java.util.Scanner;

public class Madlib {

    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter a bird name: ");
        String color = keyboardInput.nextLine();
        System.out.print("Enter a plural noun: ");
        String pluralNoun = keyboardInput.nextLine();
        System.out.print("Enter a celebrity: ");
        String celebrity = keyboardInput.nextLine();

        System.out.println("tulips are " + color + "\n" + pluralNoun + " are blue \n" + "I love " + celebrity);
    }
}
