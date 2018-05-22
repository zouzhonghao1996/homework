package homework.javaoopch14;


public class Student {
	private String name;
	private String[] courses;
	private String[] scores;
	

	public void showStudents() {
		double gpa = 0;
		int x = 0;
		System.out.println(name);
		for (int i = 0; i < courses.length ; i++) {
			System.out.print(courses[i]);
			if (!scores[i].equals("没有等级")) {
				System.out.println("[等级：" + scores[i]+ "]");
				gpa += getGPA(scores[i]);
				x++;
			} else {
				System.out.println("[等级：没有等级编号]");
			}			
		}
		System.out.println("GPA值为：" + (gpa / x));
	}

	public double getGPA(String score) {
		switch (score) {
		case "A+":
			return 4.0;
		case "A":
			return 3.75;
		case "A-":
			return 3.25;
		case "B+":
			return 3.0;
		case "B":
			return 2.75;
		case "B-":
			return 2.25;
		case "C+":
			return 2.0;
		case "C":
			return 1.75;
		case "C-":
			return 1.25;
		case "D+":
			return 1.0;
		case "D":
			return 0.75;
		case "D-":
			return 0.25;
		}
		return -1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String[] getScores() {
		return scores;
	}

	public void setScores(String[] scores) {
		this.scores = scores;
	}
      
	

}
