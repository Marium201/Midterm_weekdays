package string.problems;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        Anagram anagram = new Anagram();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first word: ");

        String firstWord = scanner.nextLine();

        System.out.println("Please enter the second word : ");

        String secondWord = scanner.nextLine();

        anagram.anagram(firstWord,secondWord);




    }
    public void anagram(String a, String b){
        char[] arrayOfCharFromStringA = a.toCharArray();
        char[] arrayOfCharFromStringB = b.toCharArray();

        Arrays.sort(arrayOfCharFromStringA);
        Arrays.sort(arrayOfCharFromStringB);

        if (Arrays.equals(arrayOfCharFromStringA, arrayOfCharFromStringB)) {
            System.out.println("words are anangram");
        } else
            System.out.println("words are not anangram");
    }

    }


