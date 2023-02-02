package com.greedy.section03.filterStream.dto;

public class MemberDTO implements java.io.Serializable {
	
	private String id;
	private String pwd;
	private String name;
	private String email;
	private int age;
	private char gender;
	/* 직렬화에서 제외하고 싶은 필드에 transient 키워드를 사용한다. */
	private transient double point;
	
	public MemberDTO( ) {}
	

	public MemberDTO(String id, String pwd, String name, String email, int age, char gender, double point) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.point = point;
	}


	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public double getPoint() {
		return point;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setPoint(double point) {
		this.point = point;
	}


	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", age=" + age
				+ ", gender=" + gender + "]";
	}

}
