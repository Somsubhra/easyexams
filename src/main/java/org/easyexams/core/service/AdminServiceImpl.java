package org.easyexams.core.service;

import org.easyexams.core.exception.AdminExistsException;
import org.easyexams.core.exception.AuthenticationException;
import org.easyexams.core.model.Admin;
import org.easyexams.core.repository.AdminRepository;
import org.easyexams.core.util.Password;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    private AdminRepository adminRepository;

    @Autowired
    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Boolean initialized() {
        return adminRepository.count() != 0;
    }

    @Override
    public Admin create(String username, String password) {

        if(!adminRepository.countByUsername(username).equals(0)) {
            throw new AdminExistsException(username);
        }

        Admin admin = new Admin(username, password);
        admin = adminRepository.save(admin);

        return admin;
    }

    @Override
    public Boolean authenticate(String username, String password) {
        Admin admin = adminRepository.findByUsername(username);

        if(admin == null) {
            throw new AuthenticationException();
        }

        return Password.verify(password, admin.getPassword());
    }
}
