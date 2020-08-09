package com.gerry.springboot;

import com.gerry.springboot.bean.Emp;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @RunWith(SpringRunner.class) : 在当前测试类获取所有组件
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBoot02ConfigApplicationTests {
    @Autowired
    Emp emp;

    @Test
    public void contextLoads() {
        System.out.println(emp);
    }

}
