package ch.bbw.smartfarming.service;

import ch.bbw.smartfarming.model.Test;
import ch.bbw.smartfarming.repo.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestRepository testRepository;

    public List<Test> getTestData(){
        return testRepository.findAll();
    }
}
