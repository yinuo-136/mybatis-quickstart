package com.ianhou136;

import com.ianhou136.mapper.UserMapper;
import com.ianhou136.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisQuickstartApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testListUser() {
        List<User> userlist = userMapper.list();
        userlist.forEach(System.out::println);
    }

}
