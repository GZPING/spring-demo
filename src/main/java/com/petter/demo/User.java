package com.petter.demo;

/**
 * @author : GD
 * @date :2020/5/27 : 23:09
 */
public class User {
	public User(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	private String name;
	private String sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", sex='" + sex + '\'' +
				'}';
	}
}
