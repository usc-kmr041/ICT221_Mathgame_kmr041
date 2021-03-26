package au.edu.usc.mathgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class QuestionTest {

    @Test
    void testCreate() {
        Question q = new Question();
        /* addition question unit test correct*/
        q.addQuestion(3, 4, 1);
        assertFalse(q.checkAnswer(7, 7));
        /* subtraction question unit test correct*/
        q.addQuestion(5, 3, 2);
        assertFalse(q.checkAnswer(2, 2));
        /* multiplication question unit test correct*/
        q.addQuestion(1, 1, 3);
        assertFalse(q.checkAnswer(1, 1));
        /* division question unit test correct*/
        q.addQuestion(10, 5, 4);
        assertFalse(q.checkAnswer(2, 2));

    }

}
