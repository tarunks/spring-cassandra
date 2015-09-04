package com.tarun.myapp.entity;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

@Table (value="user")
public class User {

	
	 @PrimaryKeyColumn(name = "id",ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private final String id;

	@Column(value="fname")
	private String fname;
	
	@Column(value="lname")
	private String lname;
	
	@Column(value="email")
	private String email;
	
	@Column (value="age")
	private int age;

	public User(String id, String fname,String lname,String email, int age) {
		this.id = id;
		this.fname = fname;	
		this.lname = lname;
		this.email = email;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return fname+" " + lname;
	}
	
	public String email(){
		return email;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + fname +" "+ lname + ", age=" + age + "]";
	}

}