package jp.foobardam;

public class Person {
	private String name;
	private int age;
	private String tel;
	
	public Person(){}
	public Person(String name, int age, String tel) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

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
		System.out.println(new Person("‘¾˜Y", 28, "090-1234-5678"));
	}
}