package jp.foobardam;

public class Employee extends Person {
	private Company company;

	public Employee(){}
	public Employee(String name, int age, String tel, Company company) {
		super(name, age, tel);
		this.company = company;
	}
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
}
