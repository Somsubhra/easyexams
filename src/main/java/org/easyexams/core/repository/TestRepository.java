package org.easyexams.core.repository;

import org.easyexams.core.model.Test;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestRepository extends MongoRepository<Test, String> {

    Integer countByName(String name);
}
