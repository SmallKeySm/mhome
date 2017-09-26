package com.wzj;

import com.wzj.dubbo.Application;
import com.wzj.dubbo.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class DubboTest {
    @Autowired(required = false)
    DemoService demoService;

    @Test
    public void test() {
        System.out.println(demoService.getName());
    }
}
