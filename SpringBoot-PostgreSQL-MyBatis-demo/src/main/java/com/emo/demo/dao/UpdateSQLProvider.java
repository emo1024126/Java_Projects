package com.emo.demo.dao;

import com.emo.demo.entity.UserEntity;
import org.apache.ibatis.jdbc.SQL;

public class UpdateSQLProvider {

	public String updateByUserId(UserEntity userEntity) {
		return new SQL(){
			{
				UPDATE("t_user t");

				if (userEntity.getUsername() != null){
					SET("username = #{username}");
				}
				if (userEntity.getPassword() != null){
					SET("password = #{password}");
				}

				WHERE("t.user_id = #{userId}");
			}
		}.toString();
	}
}
