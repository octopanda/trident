package com.octopanda.trident.custom.model;

import java.util.Date;

public class User {
	public User() {}
	
	public User(Long id) {
		this.id = id;
	}
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public User(Long id, String username, String password, String realname, String nickname, Boolean isMale, Date birthday, Integer status) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.realname = realname;
		this.nickname = nickname;
		this.isMale = isMale;
		this.birthday = birthday;
		this.status = status;
	}
	
	private Long id;
	private String username;
	private String password;
	private String realname;
	private String nickname;
	private Boolean isMale;
	private Date birthday;
	private Integer status;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Boolean getIsMale() {
		return isMale;
	}

	public void setIsMale(Boolean isMale) {
		this.isMale = isMale;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
