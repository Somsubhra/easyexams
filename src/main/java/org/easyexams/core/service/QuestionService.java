package org.easyexams.core.service;

import org.easyexams.core.model.Question;

import java.util.List;

public interface QuestionService {

    Question addQuestion(String text, String categoryId, Integer difficulty);

    Question addOption(String questionId, String text);

    Question setAnswer(String questionId, String answer);

    Question setDifficulty(String questionId, Integer difficulty);

    List<Question> list();

    List<Question> list(String categoryId);

    Question getDetails(String questionId);
}
