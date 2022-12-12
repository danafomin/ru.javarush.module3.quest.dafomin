package ru.javarush.module3.quest.dafomin.model;

import ru.javarush.module3.quest.dafomin.anatation.Generated;

import java.util.List;
import java.util.Objects;

public class Question {
    private Long id;
    private String questionText;
    private boolean isLast;
    private List<Long> usеAnswerId;

    public Question(Long id, String questionText, boolean isLast, List<Long> usеAnswerId) {
        this.id = id;
        this.questionText = questionText;
        this.isLast = isLast;
        this.usеAnswerId = usеAnswerId;
    }

    public Question(){}

    public Long getId() {
        return id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public boolean getIsLast() {
        return isLast;
    }

    public List<Long> getUsеAnswerId() {
        return usеAnswerId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setLast(boolean last) {
        isLast = last;
    }

    public void setUsеAnswerId(List<Long> usеAnswerId) {
        this.usеAnswerId = usеAnswerId;
    }

    @Override
    @Generated
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return isLast == question.isLast && id.equals(question.id) && questionText.equals(question.questionText) && usеAnswerId.equals(question.usеAnswerId);
    }

    @Override
    @Generated
    public int hashCode() {
        return Objects.hash(id, questionText, isLast, usеAnswerId);
    }

    @Override
    @Generated
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", questionText='" + questionText + '\'' +
                ", isLast=" + isLast +
                ", usеAnswerId=" + usеAnswerId +
                '}';
    }
}
