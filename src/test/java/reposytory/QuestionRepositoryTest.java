package reposytory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.javarush.module3.quest.dafomin.model.Question;
import ru.javarush.module3.quest.dafomin.reposytory.QuestionRepository;

import java.util.List;

public class QuestionRepositoryTest {

    QuestionRepository questionRepository = new QuestionRepository(List.of(
            new Question(1L, "Do you want to be the world champion in football", false, List.of(1L, 2L)),
            new Question(2L, "What will you choose ball or TV show?", false, List.of(3L, 4L)),
            new Question(3L, "Game Over! You will never become like Messi!", false, List.of(11L)),
            new Question(4L, "Early morning! Your mom woke you up so that you could go for a workout!", false, List.of(5L, 6L)),
            new Question(5L, "Tomorrow is an important day! A coach from your favorite team is coming to watch your workout!", false, List.of(7L, 8L)),
            new Question(6L, "You have reached the final of the 2098 World Championship! Tomorrow is your most important match in life!", false, List.of(9L, 10L)),
            new Question(7L, "You WIN", false, List.of(11L))
    ));


    @Test
    void findQuestionByIdTest() {
        Question expectedQuestion = new Question(3L, "Game Over! You will never become like Messi!", false, List.of(11L));

        Assertions.assertEquals(expectedQuestion, questionRepository.findById(3L));
    }
}
