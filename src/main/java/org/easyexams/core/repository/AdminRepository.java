package org.easyexams.core.repository;

import org.easyexams.core.model.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin, String> {

    Integer countByUsername(String username);

    Admin findByUsername(String username);
}
