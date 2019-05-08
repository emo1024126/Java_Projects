package com.emo.demo;

import com.emo.demo.dao.UserMapper;
import com.emo.demo.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Random;
import java.util.UUID;


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

	@Test
	public void testAll() {

		UserEntity userEntity = new UserEntity(UUID.randomUUID().toString().replaceAll("-",""),"张三","01234");
		//增
		int insertResult = userMapper.insertUser(userEntity);
		//查
		String userId = userEntity.getUserId();
		List<UserEntity> list1 = userMapper.findByUserId(userId);
		//改
		userEntity.setUsername("李四");
		userEntity.setPassword("98765");
		int updateResult = userMapper.updateByUserId(userEntity);
		List<UserEntity> list2 = userMapper.findByUserId(userEntity.getUserId());
		//删
		int deleteResult = userMapper.delete(userEntity.getUserId());
		List<UserEntity> list3 = userMapper.findByUserId(userEntity.getUserId());

		System.out.println();
	}


}
