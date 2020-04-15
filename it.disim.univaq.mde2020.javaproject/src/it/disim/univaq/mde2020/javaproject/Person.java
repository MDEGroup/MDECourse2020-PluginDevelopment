package it.disim.univaq.mde2020.javaproject;

public class Person {
	private String firstname;
	private String lastname;
	private int age;
	private boolean adult;
	public Person(String firstname, String lastname, int age, boolean adult) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.adult = adult;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isAdult() {
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	private String family;
}
