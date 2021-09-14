/*
* UCF COP 3330 Fall 2021 Assignment 4 solution
* Copyright 2021 Rahel Haque
 */


import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner madlib = new Scanner(System.in);
        System.out.println("Enter a noun: ");
        String noun = madlib.nextLine();
        System.out.println("Enter a verb: ");
        String verb = madlib.nextLine();
        System.out.println("Enter an adjective");
        String adjective = madlib.nextLine();
        System.out.println("Enter an adverb");
        String adverb = madlib.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
    }
}