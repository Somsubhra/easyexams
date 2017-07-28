package org.easyexams.core.service;

import org.easyexams.core.repository.PaperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaperServiceImpl implements PaperService {

    private PaperRepository paperRepository;

    @Autowired
    public PaperServiceImpl(PaperRepository paperRepository) {
        this.paperRepository = paperRepository;
    }
}
