package com.emo.demo.dao;

import com.emo.demo.entity.UserEntity;
import org.apache.ibatis.annotations.*;

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


	@InsertProvider(type = InsertSQLProvider.class, method = "insertUser")
	int insertUser(UserEntity userEntity);

	@SelectProvider(type = SelectSQLProvider.class, method = "findByUserId")
	List<UserEntity> findByUserId(String userId);

	@DeleteProvider(type = DeleteSQLProvider.class, method = "deleteByUserId")
	int deleteByUserId(String userId);

	@UpdateProvider(type = UpdateSQLProvider.class, method = "updateByUserId")
	int updateByUserId(UserEntity userEntity);
}
