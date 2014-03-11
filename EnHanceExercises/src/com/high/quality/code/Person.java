package com.high.quality.code;

public class Person {

	private String name;
	
	private Home home;
	private int age;
	
	public Person(String _name,int _age){
		this.name=_name;
		this.age = _age ;
	}
	public static class Home{
		
		private String address;
		private String tel;
		
		public Home(String _address,String _tel){
			this.address = _address;
			this.tel = _tel ; 
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}
}
