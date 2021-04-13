package au.edu.usc.mathgame;

import java.util.Scanner;

public class JokeMathQuestion extends Question {

    public static void addJokeQuestion() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Real programmers count from what number?");
        scan.nextInt();
        System.out.println("They count from 0. Ha. Ha.");
    }
}
