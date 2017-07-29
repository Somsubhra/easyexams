package org.easyexams.core.service;

import org.easyexams.core.exception.QuestionNotFoundException;
import org.easyexams.core.model.Option;
import org.easyexams.core.model.Question;
import org.easyexams.core.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionRepository questionRepository;

    @Autowired
    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question addQuestion(String text, String categoryId, Integer difficulty) {
        Question question = new Question(text, categoryId, difficulty);
        question = questionRepository.save(question);
        return question;
    }

    @Override
    public Question addOption(String questionId, String text) {
        Question question = getDetails(questionId);
        question.getOptions().put(UUID.randomUUID().toString(), new Option(text));
        return questionRepository.save(question);
    }

    @Override
    public Question setAnswer(String questionId, String answer) {
        Question question = getDetails(questionId);
        question.setAnswer(answer);
        return questionRepository.save(question);
    }

    @Override
    public Question setDifficulty(String questionId, Integer difficulty) {
        Question question = getDetails(questionId);
        question.setDifficulty(difficulty);
        return questionRepository.save(question);
    }

    @Override
    public List<Question> list() {
        return questionRepository.findAll();
    }

    @Override
    public List<Question> list(String categoryId) {
        return questionRepository.findByCategoryId(categoryId);
    }

    @Override
    public Question getDetails(String questionId) {
        Question question = questionRepository.findOne(questionId);

        if(question == null) {
            throw new QuestionNotFoundException();
        }

        return question;
    }

    @Override
    public void delete(String questionId) {
        Question question = getDetails(questionId);
        questionRepository.delete(question);
    }

    @Override
    public Question deleteOption(String questionId, String optionId) {
        Question question = getDetails(questionId);

        if(question.getAnswer().equals(optionId)) {
            question.setAnswer(null);
        }

        question.getOptions().remove(optionId);

        return questionRepository.save(question);
    }
}
