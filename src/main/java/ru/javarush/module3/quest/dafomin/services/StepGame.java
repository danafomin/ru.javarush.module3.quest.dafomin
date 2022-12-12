package ru.javarush.module3.quest.dafomin.services;


import ru.javarush.module3.quest.dafomin.anatation.Generated;
import ru.javarush.module3.quest.dafomin.model.Answer;
import ru.javarush.module3.quest.dafomin.model.Question;

import java.util.List;
import java.util.Objects;

public class StepGame {
    private Question question;
    private List<Answer> answers;

    public StepGame(Question question, List<Answer> answers) {
        this.question = question;
        this.answers = answers;
    }

    public Question getQuestion() {
        return question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StepGame stepGame = (StepGame) o;
        return Objects.equals(question, stepGame.question) && Objects.equals(answers, stepGame.answers);
    }

    @Override
    @Generated
    public int hashCode() {
        return Objects.hash(question, answers);
    }
}
