package com.aurora.test;


import com.aurora.web.dao.project.PrProjectDao;
import com.aurora.web.main.StartApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartApp.class)

public class TestSptingboot {
    @Autowired
    PrProjectDao prProjectDao;

    @Test
    public void test1(){

    }
}
