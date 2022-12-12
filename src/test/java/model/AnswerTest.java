package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.javarush.module3.quest.dafomin.model.Answer;

class AnswerTest {
    Answer answer = new Answer(3L, "TestAnswer", 4L);

    @Test
    void getAnswerIdTest(){
        Long answerId = answer.getId();
        Assertions.assertEquals(3L, answerId);
    }

    @Test
    void getAnswerTextTest(){
        String answerText = answer.getAnswerText();
        Assertions.assertEquals("TestAnswer", answerText);
    }

    @Test
    void getAnswerNextQuestionIdTest(){
        Long nextQuestionId = answer.getNextQuestionId();
        Assertions.assertEquals(4L, nextQuestionId);
    }

    @Test
    void setAnswerIdTest(){
        answer.setId(7L);
        Assertions.assertEquals(7L, answer.getId());
    }

    @Test
    void setAnswerTextTest(){
        answer.setAnswerText("WorldCap 2022 in Qatar");
        Assertions.assertEquals("WorldCap 2022 in Qatar", answer.getAnswerText());
    }

    @Test
    void setAnswerNextQuestionIdTest(){
        answer.setNextQuestionId(11L);
        Assertions.assertEquals(11L, answer.getNextQuestionId());
    }
}
