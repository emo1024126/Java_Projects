package com.emo.demo.dao;

import com.emo.demo.entity.UserEntity;
import org.apache.ibatis.jdbc.SQL;

public class InsertSQLProvider {

	public String insertUser(final UserEntity userEntity) {
		return new SQL() {
			{
				INSERT_INTO("t_user");
				if (userEntity.getUserId() != null) {
//					VALUES("user_id", userEntity.getUserId());
					VALUES("user_id", "#{userId}");
				}
				if (userEntity.getUsername() != null) {
//					VALUES("username", userEntity.getUsername());
					VALUES("username", "#{username}");
				}
				if (userEntity.getPassword() != null) {
//					VALUES("password", userEntity.getPassword());
					VALUES("password", "#{password}");
				}
			}
		}.toString();
	}
}
