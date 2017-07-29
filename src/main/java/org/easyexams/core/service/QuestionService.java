package org.easyexams.core.service;

import org.easyexams.core.model.Question;

import java.util.List;

public interface QuestionService {

    Question addQuestion(String text, String categoryId, Integer difficulty);

    Question addOption(String questionId, String text);

    Question setAnswer(String questionId, String answer);

    Question setText(String questionId, String text);

    Question setCategory(String questionId, String categoryId);

    Question setDifficulty(String questionId, Integer difficulty);

    List<Question> list();

    List<Question> list(String categoryId);

    Question getDetails(String questionId);

    void delete(String questionId);

    Question deleteOption(String questionId, String optionId);
}
