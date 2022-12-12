package services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.javarush.module3.quest.dafomin.model.Answer;
import ru.javarush.module3.quest.dafomin.model.Question;
import ru.javarush.module3.quest.dafomin.reposytory.AnswerRepository;
import ru.javarush.module3.quest.dafomin.reposytory.QuestionRepository;
import ru.javarush.module3.quest.dafomin.services.Settings;


import java.io.IOException;
import java.util.List;

class SettingsTest {
    Settings settings = new Settings(SettingsTest.class.getClassLoader().getResourceAsStream("SettingsTest.yaml"));

    @Test
    void getDescriptionTest() {
        String expectedDescription = "FirstGame";
        Assertions.assertEquals(expectedDescription, settings.getDescription());
    }

    @Test
    void getGameIdTest() {
        Long expectedGameId = 5L;
        Assertions.assertEquals(expectedGameId, settings.getGameId());
    }

    @Test
    void getFirstQuestionIdTest() {
        Long expectedFirstQuestionId = 8L;
        Assertions.assertEquals(expectedFirstQuestionId, settings.getFirstQuestionId());
    }

    @Test
    void getCreaturesQuestionRepositoryTest() {
        QuestionRepository expectedQuestionRepository = new QuestionRepository(List.of(
                new Question(1L, "questionText_1", false, List.of(1L, 2L)),
                new Question(2L, "questionText_2", false, List.of(3L, 4L)),
                new Question(3L, "Game Over_3", false, List.of(11L)),
                new Question(4L, "questionText_4", false, List.of(5L, 6L)),
                new Question(5L, "questionText_5", false, List.of(7L, 8L)),
                new Question(6L, "questionText_6", false, List.of(9L, 10L)),
                new Question(7L, "You WIN_7", false, List.of(11L))
        ));
        Assertions.assertEquals(expectedQuestionRepository, settings.getCreaturesQuestionRepository());
    }

    @Test
    void getCreaturesAnswerRepositoryTest() {
        AnswerRepository expectedAnswerRepository = new AnswerRepository(List.of(
                new Answer(1L, "answerText_1", 2L),
                new Answer(2L, "answerText_2", 3L),
                new Answer(3L, "answerText_3", 4L),
                new Answer(4L, "answerText_4", 3L),
                new Answer(5L, "answerText_5", 5L),
                new Answer(6L, "answerText_6", 3L),
                new Answer(7L, "answerText_7", 6L),
                new Answer(8L, "answerText_8", 3L),
                new Answer(9L, "answerText_9", 7L),
                new Answer(10L, "answerText_10", 3L),
                new Answer(11L, "Try Agane_11", 1L)
        ));
        Assertions.assertEquals(expectedAnswerRepository, settings.getCreaturesAnswerRepository());
    }

    @Test
    void getCreaturesQuestionsTest() {
        List<Question> expectedCreaturesQuestions = List.of(
                new Question(1L, "questionText_1", false, List.of(1L, 2L)),
                new Question(2L, "questionText_2", false, List.of(3L, 4L)),
                new Question(3L, "Game Over_3", false, List.of(11L)),
                new Question(4L, "questionText_4", false, List.of(5L, 6L)),
                new Question(5L, "questionText_5", false, List.of(7L, 8L)),
                new Question(6L, "questionText_6", false, List.of(9L, 10L)),
                new Question(7L, "You WIN_7", false, List.of(11L)));
        Assertions.assertEquals(expectedCreaturesQuestions, settings.getCreaturesQuestions());
    }

    @Test
    void getCreaturesQuestionsNullTest() throws IOException {
        Assertions.assertNull(new Settings(SettingsTest.class.getClassLoader().getResourceAsStream("SettingsTestNull.yaml")).getCreaturesQuestionRepository());
    }

    @Test
    void getCreaturesAnswersTest() {
        List<Answer> expectedCreaturesAnswer = List.of(
                new Answer(1L, "answerText_1", 2L),
                new Answer(2L, "answerText_2", 3L),
                new Answer(3L, "answerText_3", 4L),
                new Answer(4L, "answerText_4", 3L),
                new Answer(5L, "answerText_5", 5L),
                new Answer(6L, "answerText_6", 3L),
                new Answer(7L, "answerText_7", 6L),
                new Answer(8L, "answerText_8", 3L),
                new Answer(9L, "answerText_9", 7L),
                new Answer(10L, "answerText_10", 3L),
                new Answer(11L, "Try Agane_11", 1L));
        Assertions.assertEquals(expectedCreaturesAnswer, settings.getCreaturesAnswer());
    }

    @Test
    void getCreaturesAnswersNullTest() throws IOException {
        Assertions.assertNull(new Settings(SettingsTest.class.getClassLoader().getResourceAsStream("SettingsTestNull.yaml")).getCreaturesAnswerRepository());
    }


}