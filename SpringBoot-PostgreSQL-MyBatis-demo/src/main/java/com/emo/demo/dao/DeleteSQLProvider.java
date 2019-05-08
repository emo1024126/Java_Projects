package com.emo.demo.dao;

import org.apache.ibatis.jdbc.SQL;

public class DeleteSQLProvider {

	public String deleteByUserId(String userId) {
		return new SQL() {
			{
				DELETE_FROM("t_user");

				WHERE("userId = #{userId}");
			}
		}.toString();
	}
}
