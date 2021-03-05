package com.yangtao.dao;

import com.yangtao.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author yangtao
 * @description
 * @create 2021-03-02 16:15
 */
public class UserMapperImpl implements UserMapper {

    //SqlSession执行的操作将被SqlSessionTemplate代替
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
