package com.sakshi.bms.model;

public class Account {
	private Long accNo;
	private String name;
	private Long mobNo;
	private Long adharNo;
	private String gender;
	private int age;
	private double balance;
        public String name(){
             System.out.println("This Project is about bank managment System");
          }

        public String address(){
         System.out.println("New method created");
          }

	public Long getAccNo() {
		return accNo;
	}
	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobNo() {
		return mobNo;
	}
	public void setMobNo(Long mobNo) {
		this.mobNo = mobNo;
	}
	public Long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(Long adharNo) {
		this.adharNo = adharNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		if(gender=="female" || gender=="male") {
		this.gender = gender;
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
}
