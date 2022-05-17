package ch.bbw.smartfarming.controller;

import ch.bbw.smartfarming.model.Test;
import ch.bbw.smartfarming.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping(path = "/test")
    public List<Test> getTest(){
        List<Test> tests = testService.getTestData();
        tests.forEach((i) -> System.out.println(i.getId() + " : " + i.getTest()));
        return testService.getTestData();
    }
}
