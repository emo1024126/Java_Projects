package com.emo.demo.dao;

import com.emo.demo.entity.UserEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

	@Select("select * from t_user where 1=1")
	List<UserEntity> list();

	@Select("select * from t_user where username like #{username}")
	List<UserEntity> findByUsername(String username);

	@Select("select * from t_user where user_id like #{userId}")
	UserEntity getOne(String userId);

	@Delete("delete from t_user where user_id like #{userId}")
	int delete(String userId);

}
