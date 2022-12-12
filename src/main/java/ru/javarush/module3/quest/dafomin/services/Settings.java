package ru.javarush.module3.quest.dafomin.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import ru.javarush.module3.quest.dafomin.anatation.Generated;
import ru.javarush.module3.quest.dafomin.model.Answer;
import ru.javarush.module3.quest.dafomin.model.Question;
import ru.javarush.module3.quest.dafomin.reposytory.AnswerRepository;
import ru.javarush.module3.quest.dafomin.reposytory.QuestionRepository;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

public class Settings {


    private String description;
    private Long gameId;
    private Long firstQuestionId;
    private List<Question> creaturesQuestions;

    private List<Answer> creaturesAnswer;

    @Generated
    public Settings(InputStream resource) {
        try {
            ObjectReader objectReader = new YAMLMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).readerForUpdating(this);
            if (Objects.nonNull(resource)) {
                objectReader.readValue(resource);
            }
        } catch (IOException e) {
            System.out.printf("Ошибка при чтении файла настроек init.yml: %s", e);
        }
    }


    public QuestionRepository getCreaturesQuestionRepository() {
        QuestionRepository creaturesQuestionRepository = null;
        if (creaturesQuestions != null) {
            creaturesQuestionRepository = new QuestionRepository(creaturesQuestions);
        }
        return creaturesQuestionRepository;
    }

    public AnswerRepository getCreaturesAnswerRepository() {
        AnswerRepository creatureAnswerRepository = null;
        if (creaturesQuestions != null) {
            creatureAnswerRepository = new AnswerRepository(creaturesAnswer);
        }
        return creatureAnswerRepository;
    }

    public String getDescription() {
        return this.description;
    }

    public Long getGameId() {
        return gameId;
    }

    public Long getFirstQuestionId() {
        return firstQuestionId;
    }

    public List<Question> getCreaturesQuestions() {
        return creaturesQuestions;
    }

    public List<Answer> getCreaturesAnswer() {
        return creaturesAnswer;
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Settings settings = (Settings) o;
        return Objects.equals(description, settings.description) && Objects.equals(gameId, settings.gameId) && Objects.equals(firstQuestionId, settings.firstQuestionId) && Objects.equals(creaturesQuestions, settings.creaturesQuestions) && Objects.equals(creaturesAnswer, settings.creaturesAnswer);
    }

    @Override
    @Generated
    public int hashCode() {
        return Objects.hash(description, gameId, firstQuestionId, creaturesQuestions, creaturesAnswer);
    }

}


