package com.wqy.student.entity;

public class Student {
	private String name;
	private int age;
	private int number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean equals(Object obj){
		Student stu = (Student)obj;
		return this.number==stu.number&&this.name==stu.name;
	}
	public int hashCode(){
		int nameHashCode = name.hashCode();
		return nameHashCode+number*3;
	}
}
