package com.erye.entities;

import java.sql.Date;

public class User {

	private Integer id;
	private String name;
	private String password;
	private String authority;
	private Date create_time;
	private Date modify_time;
	
	public User() {
		super();
	}
	public User(Integer id, String name, String password, String authority, Date create_time, Date modify_time) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.authority = authority;
		this.create_time = create_time;
		this.modify_time = modify_time;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getModify_time() {
		return modify_time;
	}
	public void setModify_time(Date modify_time) {
		this.modify_time = modify_time;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", authority=" + authority
				+ ", create_time=" + create_time + ", modify_time=" + modify_time + "]";
	}
}
