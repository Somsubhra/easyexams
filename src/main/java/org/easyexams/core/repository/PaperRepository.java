package org.easyexams.core.repository;

import org.easyexams.core.model.Paper;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaperRepository extends MongoRepository<Paper, String> {

}
