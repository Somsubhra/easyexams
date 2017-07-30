package org.easyexams.core.service;

import org.easyexams.core.exception.TestExistsException;
import org.easyexams.core.exception.TestNotFoundException;
import org.easyexams.core.model.Test;
import org.easyexams.core.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {

    private TestRepository testRepository;

    @Autowired
    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public Test create(String name, Map<String, Double> weightage, Date startTime, Long duration, Boolean visible) {
        if(!testRepository.countByName(name).equals(0)) {
            throw new TestExistsException(name);
        }

        List<String> questionIds = new ArrayList<>();

        // TODO: Construct the list of questions based on weightage

        Test test = new Test(name, weightage, questionIds, startTime, duration);
        return testRepository.save(test);
    }

    @Override
    public Test setWeightage(String testId, Map<String, Double> weightage) {
        Test test = getDetails(testId);
        test.setWeightage(weightage);

        // TODO: Regenerate the list of questions
        return testRepository.save(test);
    }

    @Override
    public Test setStartTime(String testId, Date startTime) {
        Test test = getDetails(testId);
        test.setStartTime(startTime);
        return testRepository.save(test);
    }

    @Override
    public Test setDuration(String testId, Long duration) {
        Test test = getDetails(testId);
        test.setDuration(duration);
        return testRepository.save(test);
    }

    @Override
    public Test setVisible(String testId, Boolean visible) {
        Test test = getDetails(testId);
        test.setVisible(visible);
        return testRepository.save(test);
    }

    @Override
    public Test getDetails(String testId) {
        Test test = testRepository.findOne(testId);

        if(test == null) {
            throw new TestNotFoundException();
        }

        return test;
    }

    @Override
    public void delete(String testId) {
        testRepository.delete(getDetails(testId));
    }
}
