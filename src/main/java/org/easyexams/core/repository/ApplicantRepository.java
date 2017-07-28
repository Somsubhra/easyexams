package org.easyexams.core.repository;

import org.easyexams.core.model.Applicant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApplicantRepository extends MongoRepository<Applicant, String> {

}
