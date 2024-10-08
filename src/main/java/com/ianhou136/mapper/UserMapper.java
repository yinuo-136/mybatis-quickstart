package com.ianhou136.mapper;

import com.ianhou136.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select id from user")
    List<User> list();

}

