package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.javarush.module3.quest.dafomin.model.Question;

import java.util.List;

public class QuestionTest {

    Question question = new Question(4L, "TestQuestion", false, List.of(3L, 7L));

    @Test
    void getQuestionIdTest() {
        Long questionId = question.getId();
        Assertions.assertEquals(4L, questionId);
    }

    @Test
    void getQuestionTextTest() {
        String questionText = question.getQuestionText();
        Assertions.assertEquals("TestQuestion", questionText);
    }

    @Test
    void getIsLastTest() {
        Boolean isLast = question.getIsLast();
        Assertions.assertEquals(false, isLast);
    }

    @Test
    void getUsAnswerIdTest() {
        List<Long> usAnswerId = question.getUsеAnswerId();
        Assertions.assertEquals(List.of(3L, 7L), usAnswerId);
    }

    @Test
    void setQuestionIdTest() {
        question.setId(7L);
        Assertions.assertEquals(7L, question.getId());
    }

    @Test
    void setQuestionTextTest() {
        question.setQuestionText("WorldCap 2022 in Qatar???");
        Assertions.assertEquals("WorldCap 2022 in Qatar???", question.getQuestionText());
    }

    @Test
    void setIsLastTest() {
        question.setLast(true);
        Assertions.assertTrue(question.getIsLast());
    }


    @Test
    void setUsAnswerIdTest() {
        question.setUsеAnswerId(List.of(6L,8L));
        Assertions.assertEquals(List.of(6L,8L), question.getUsеAnswerId());
    }
}


