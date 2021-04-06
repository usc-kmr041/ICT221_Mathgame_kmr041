package au.edu.usc.mathgame;

import java.util.Random;
import java.util.Scanner;

/**
 * A simple console-based maths quiz for primary school children.
 *
 * Kevin Chester Rovillos 1131397
 * Nil
 */
public class Main {


    public static void main(String[] args) {
        Main main = new Main();
        Scanner yesno = new Scanner(System.in);
        boolean yn = true;

        do {
            main.playGame();
            System.out.println("Do you want to start a new game? Y/N");

            char userYN = yesno.next().charAt(0);

            switch (userYN) {
                case 'y':
                    break;

                case 'n':
                    yn = false;
                    break;

                default:
                    System.out.println("That is not a valid entry. Ending Program...");
                    System.exit(0);
                    break;
            }

        }  while (yn);

        System.out.println("Thank you for playing!");
        System.exit(0);

    }






    public static void playGame(){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        Question q = new Question();


        int counter = 0;

        for (int i = 0; i < 10; i++) {
            int a = rand.nextInt(20);
            int b = rand.nextInt(20+1);
            int c = rand.nextInt(4)+1;
            int solution[] = {a+b,a+b,a-b,a*b,a/b};
            q.addQuestion(a, b, c);
            if (c == 4) {
                if (b == 0) {
                        q.addQuestion(a, b, c);
                }
            }
            int answer = input.nextInt();
            q.checkAnswer(answer, solution[c]);

            if (answer == solution[c]) {
                counter++;
            }
            System.out.println("You have a current high score of "+counter+" Well done!");
        }
        /*Random rand = new Random();
        Scanner input = new Scanner(System.in);

        // now ask some random addition questions.
        for (int i = 0; i < 10; i++) {
            int a = rand.nextInt(20);
            int b = rand.nextInt(20);
            int correct = a + b;
            System.out.printf("What is %2d + %2d? ", a, b);
            int response = input.nextInt();
            if (response == correct) {
                System.out.printf("  Yes!\n");
            } else {
                System.out.printf("  No, the answer is %d.\n", correct);
            }
        }
    }*/
    }
}
