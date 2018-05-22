package homework.javaoopch15;

public class Student {
	private int id;
	private String name;
	private int score;

	
	public Student() {
		
	}
    
	
	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}


	public Student(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
   
	public void display() {
		System.out.println("学号"+id+" 姓名："+name+" 分数："+score);
	}
	public void test() {
		this.score =(int) Math.round(Math.random()*(40)+60);
		System.out.println(this.score);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}
	
}
