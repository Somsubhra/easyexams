package org.easyexams.core.service;

import org.easyexams.core.model.Applicant;
import org.easyexams.core.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicantServiceImpl implements ApplicantService {

    private ApplicantRepository applicantRepository;

    @Autowired
    public ApplicantServiceImpl(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    @Override
    public Applicant create(String uid, String email, String testId) {
        return null;
    }

    @Override
    public Applicant getDetails(String applicantId) {
        return null;
    }
}
