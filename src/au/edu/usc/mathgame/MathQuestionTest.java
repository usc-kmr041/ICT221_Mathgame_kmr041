package au.edu.usc.mathgame;

import org.junit.jupiter.api.Test;

import static au.edu.usc.mathgame.MathQuestion.addQuestion;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MathQuestionTest {

    @Test
    void testCreate() {
        MathQuestion q = new MathQuestion();
        /* addition question unit test correct*/
        addQuestion(3, 4, 1);
        assertFalse(q.checkAnswer(7, 7));
        /* subtraction question unit test correct*/
        addQuestion(5, 3, 2);
        assertFalse(q.checkAnswer(2, 2));
        /* multiplication question unit test correct*/
        addQuestion(1, 1, 3);
        assertFalse(q.checkAnswer(1, 1));
        /* division question unit test correct*/
        addQuestion(10, 5, 4);
        assertFalse(q.checkAnswer(2, 2));


        }
    }

