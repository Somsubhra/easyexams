package org.easyexams.core.service;

import org.easyexams.core.model.Test;

import java.util.Date;
import java.util.Map;

public interface TestService {

    Test create(String name, Map<String, Double> weightage, Date startTime, Long duration, Boolean visible);

    Test setWeightage(String testId, Map<String, Double> weightage);

    Test setStartTime(String testId, Date startTime);

    Test setDuration(String testId, Long duration);

    Test setVisible(String testId, Boolean visible);

    Test getDetails(String testId);

    void delete(String testId);
}
