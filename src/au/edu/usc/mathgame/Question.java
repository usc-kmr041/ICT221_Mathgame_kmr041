package au.edu.usc.mathgame;

public class Question {


    public static void addQuestion(int value1, int value2, int type) {
        if (type == 1) {
            System.out.printf("What is %2d + %2d? ", value1, value2);
        }
        if (type == 2) {
            System.out.printf("What is %2d - %2d? ", value1, value2);
        }
        if (type == 3) {
            System.out.printf("What is %2d multiplied by %2d? ", value1, value2);
        }
        if (type == 4) {
            System.out.printf("What is %2d divided by %2d? ", value1, value2);
        }

    }
}