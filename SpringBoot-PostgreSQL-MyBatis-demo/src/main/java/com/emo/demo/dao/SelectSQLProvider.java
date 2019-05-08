package com.emo.demo.dao;

import org.apache.ibatis.jdbc.SQL;

public class SelectSQLProvider {

	public String findByUserId(String userId) {
		return new SQL() {
			{
				SELECT("t.user_id, t.username, t.password");

				FROM("t_user t");

				WHERE("t.user_id = #{userId}");
			}
		}.toString();
	}
}
