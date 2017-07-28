package org.easyexams.core.service;

import org.easyexams.core.model.Admin;

public interface AdminService {

    Boolean initialized();

    Admin create(String username, String password);

    Boolean authenticate(String username, String password);
}
