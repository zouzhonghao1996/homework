package homework.javaoopch15;

import java.util.Scanner;

public class StuManage {
	private static Student[] stu = new Student[5];
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("你要执行什么操作  a:添加学生 b：删除学生  c：查询学生  d:查询所有学生");
			String str = scanner.next();
			switch (str) {
			case "a":
				addStudent();
				break;
			case "b":
				remove();
				break;
			case "c":
				select();
				break;
			case "d":
				selectAll();
				break;
			}
		}
	}

	public static void addStudent() {
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] == null) {
				System.out.println("请输入学生姓名：");
				String name = scanner.next();
				System.out.println("请输入学号：");
				int id = scanner.nextInt();
				System.out.println("获得考试分数：");
				stu[i] = new Student(id, name);
				stu[i].test();
				break;
			}
		}
	}

	public static void remove() {
		System.out.println("请输入你要删除的学生的id：");
		int delId = scanner.nextInt();
		for (int i = 0; i < stu.length; i++) {
			if (stu[i]!=null && delId == stu[i].getId() ) {
				stu[i] = null;
			}
		}
	}

	public static void select() {
		System.out.println("请输入你要查询的学生id：");
		int selId = scanner.nextInt();
		for (int i = 0; i < stu.length; i++) {
			if ( stu[i]!=null &&selId == stu[i].getId() ) {
				stu[i].display();
			}
		}
	}

	public static void selectAll() {
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null) {
				stu[i].display();
			}
		}
	}
}
