package jp.foobardam;

public class Person {
	private String name;
	private int age;
	private String tel;
	
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", tel=" + tel + "]";
	}
	public static void main(String... args){
		System.out.println(new Person());
	}
}