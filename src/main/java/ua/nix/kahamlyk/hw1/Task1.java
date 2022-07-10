package ua.nix.kahamlyk.hw1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String value = scanner.next();
        System.out.println(SumOfNumbersInString.SumOfNumbers(value));
    }
}
