package org.easyexams.core.service;

import org.easyexams.core.model.Applicant;

public interface ApplicantService {

    Applicant create(String uid, String email, String testId);

    Applicant getDetails(String applicantId);
}
