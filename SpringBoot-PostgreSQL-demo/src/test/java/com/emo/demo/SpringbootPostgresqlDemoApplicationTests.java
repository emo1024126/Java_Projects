package com.emo.demo;

import com.emo.demo.dao.UserMapper;
import com.emo.demo.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootPostgresqlDemoApplicationTests {

	@Test
	public void contextLoads() {
	}


	@SuppressWarnings("all")
	@Autowired
	UserMapper userMapper;

	@Test
	public void test_db() {
		//开始进行测试
		List<UserEntity> result = userMapper.list();
		result.size();
//		assertThat(userMapper.list().size()).isGreaterThan(1);
//		assertThat(userMapper.getOne("1")).isNotEqualTo(null);
//		assertThat(userMapper.getOne("xxx")).isEqualTo(null);
	}


}
