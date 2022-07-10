package ua.nix.kahamlyk.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of lessons");
        int lessons = scanner.nextInt();
        if(lessons>10 || lessons<1) {
            System.err.println("Incorrect data");
        } else {
          System.out.println(AmountOfLessons.LastLessonTime(lessons));
        }
    }
}
