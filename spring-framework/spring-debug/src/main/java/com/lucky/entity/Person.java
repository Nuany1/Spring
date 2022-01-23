package com.lucky.entity;

/**
 * @program: spring
 * @description: person
 * @author: Loki
 * @create: 2020-12-31 09:16
 **/
public class Person {
	private Integer id;
	private String name;
	private Integer age;

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

	public void setAge(Integer age) {
		this.age = age;
	}
}
