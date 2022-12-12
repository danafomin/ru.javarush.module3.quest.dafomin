package ru.javarush.module3.quest.dafomin.services;

import ru.javarush.module3.quest.dafomin.anatation.Generated;
import ru.javarush.module3.quest.dafomin.controller.GameServlet;
import ru.javarush.module3.quest.dafomin.model.Answer;
import ru.javarush.module3.quest.dafomin.model.Question;
import ru.javarush.module3.quest.dafomin.reposytory.AnswerRepository;
import ru.javarush.module3.quest.dafomin.reposytory.QuestionRepository;

import java.util.List;
import java.util.Objects;

public class GameService {
    Settings settings;
    private QuestionRepository questionRepository;
    private AnswerRepository answerRepository;

//    Иницилизация квещен и ансвер репозиториев
    public GameService() {
        this.settings = new Settings(GameServlet.class.getClassLoader().getResourceAsStream("Settings.yaml"));
        this.questionRepository = settings.getCreaturesQuestionRepository();
        this.answerRepository = settings.getCreaturesAnswerRepository();
    }

    @Override
    @Generated
    public String toString() {
        return "GameService{" +
                "settings=" + settings +
                ", questionRepository=" + questionRepository +
                ", answerRepository=" + answerRepository +
                '}';
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameService that = (GameService) o;
        return settings.equals(that.settings) && questionRepository.equals(that.questionRepository) && answerRepository.equals(that.answerRepository);
    }

    @Override
    @Generated
    public int hashCode() {
        return Objects.hash(settings, questionRepository, answerRepository);
    }

    public Settings getSettings() {
        return settings;
    }


    //    Формирование Шага игры из вопроса и ответов, на вход получаем id вопроса
    public StepGame findStepsGame(Long nextQuestionId){
        Question question = questionRepository.findById(nextQuestionId);
        List<Answer> answers = answerRepository.findById(question.getUsеAnswerId());
        return new StepGame(question, answers);
    }
}
