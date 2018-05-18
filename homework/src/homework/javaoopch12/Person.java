package homework.javaoopch12;

public class Person {
	protected String name;
	protected String sex;
	protected int age;

	
	public Person() {
		this.name = "张三";
		this.sex = "男";
		this.age = 22;
	}


	public Person(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
    
	public void showMessage() {
		System.out.println(name+"\n"+sex+"\n"+age+"\n");
	}
}
