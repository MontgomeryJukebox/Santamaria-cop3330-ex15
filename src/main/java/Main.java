/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the password?");
        String input = in.nextLine();
        if (input.equals("abc$123")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }
    }
}