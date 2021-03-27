package au.edu.usc.mathgame;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static au.edu.usc.mathgame.Question.addQuestion;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class QuestionTest {

    @Test
    void testCreate() {
        Question q = new Question();
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

