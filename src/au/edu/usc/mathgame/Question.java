package au.edu.usc.mathgame;

import java.util.Scanner;

public class Question {
    int value1;
    int value2;
    int answer;
    int correct;

    public static void showQuestion(int value1, int value2) {
        System.out.printf("What is %2d + %2d? ", value1, value2);
    }

    public static void checkAnswer(int answer, int correct) {
        if (answer == correct) {
            System.out.printf("  Yes!\n");
        } else {
            System.out.printf("  No, the answer is %d.\n", correct);
        }
    }
}