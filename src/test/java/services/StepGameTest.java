package services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.javarush.module3.quest.dafomin.model.Answer;
import ru.javarush.module3.quest.dafomin.model.Question;
import ru.javarush.module3.quest.dafomin.services.StepGame;

import java.util.List;

class StepGameTest {
    StepGame stepGame = new StepGame(
            new Question(2L, "What will you choose ball or TV show?", false, List.of(3L, 4L)),
            List.of(
                    new Answer(3L, "Ball!", 4L),
                    new Answer(4L, "TV!", 3L)));

    @Test
    void getQuestionTest(){
        Question expectedQuestion = new Question(2L, "What will you choose ball or TV show?", false, List.of(3L, 4L));
        Assertions.assertEquals(expectedQuestion, stepGame.getQuestion());
    }

    @Test
    void getAnswersTset(){
        List<Answer> expectedAnswers = List.of(
                new Answer(3L, "Ball!", 4L),
                new Answer(4L, "TV!", 3L));
        Assertions.assertEquals(expectedAnswers, stepGame.getAnswers());
    }
}