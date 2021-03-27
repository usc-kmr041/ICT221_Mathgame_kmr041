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
        main.playGame();
    }

    public static void playGame(){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        Question q = new Question();
        int a = rand.nextInt(20);
        int b = rand.nextInt(20);
        int c = rand.nextInt(4)+1;
        int solution[] = {a+b,a+b,a-b,a*b,a/b};
        int counter = 0;

        System.out.println(c);
        q.addQuestion(a,b,c);
        if(c==4){
            if(b==0){
                q.addQuestion(a,b,c);
            }
        }
        int answer = input.nextInt();
        q.checkAnswer(answer,solution[c]);

        if (answer == solution[c]) {
            counter++;
        }
        System.out.println(counter);

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
