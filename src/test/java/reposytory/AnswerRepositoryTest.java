package reposytory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.javarush.module3.quest.dafomin.model.Answer;
import ru.javarush.module3.quest.dafomin.reposytory.AnswerRepository;


import java.util.List;

class AnswerRepositoryTest {

    AnswerRepository answerRepository = new AnswerRepository(List.of(
            new Answer(1L, "Yes! I will be cooler than Messi!", 2L),
            new Answer(2L, "No, I dont need it!", 3L),
            new Answer(3L, "Ball!", 4L),
            new Answer(4L, "TV!", 3L),
            new Answer(5L, "Im happy to get up and run to training", 5L),
            new Answer(6L, "I say that it was canceled and go back to sleep!", 3L),
            new Answer(7L, "After school, I rush to practice, practice strikes and passes! Then I hurry home, finish my business quickly and go to bed early!", 6L)
    ));


    @Test
    void findAnswerByIdTest() {
        List<Answer> expectedAnswers = List.of(new Answer(2L, "No, I dont need it!", 3L), new Answer(5L, "Im happy to get up and run to training", 5L));

        Assertions.assertEquals(expectedAnswers, answerRepository.findById(List.of(2L, 5L)));
    }
}


