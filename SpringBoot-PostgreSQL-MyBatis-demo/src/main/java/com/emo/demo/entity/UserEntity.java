package com.emo.demo.entity;

import lombok.Data;

@Data
public class UserEntity {
	private String userId;
	private String username;
	private String password;

	public UserEntity(String userId, String username, String password) {
		this.userId = userId;
		this.username = username;
		this.password = password;
	}
}
