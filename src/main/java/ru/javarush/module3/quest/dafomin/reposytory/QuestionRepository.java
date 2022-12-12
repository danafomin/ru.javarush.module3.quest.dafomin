package ru.javarush.module3.quest.dafomin.reposytory;


import ru.javarush.module3.quest.dafomin.anatation.Generated;
import ru.javarush.module3.quest.dafomin.model.Question;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class QuestionRepository {
    private Map<Long, Question> questionMap = new HashMap<>();

    public QuestionRepository(List<Question> questionList) {
        Long id;
        for (Question question : questionList) {
            id = question.getId();
            this.questionMap.put(id, question);
        }
    }

    public Question findById(Long id){
        return questionMap.get(id);
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionRepository that = (QuestionRepository) o;
        return Objects.equals(questionMap, that.questionMap);
    }

    @Override
    @Generated
    public int hashCode() {
        return Objects.hash(questionMap);
    }
}
