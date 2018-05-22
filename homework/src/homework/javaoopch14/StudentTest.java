package homework.javaoopch14;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生个数：");
		int stus = scanner.nextInt();
		Student[] stu=new Student[stus];
		for (int x = 0; x < stus; x++) {
			stu[x] = new Student();
			System.out.println("请输入学生姓名：");
			String name=scanner.next();
			stu[x].setName(name);		
			System.out.println("请输入课程的数目：");
			int i = scanner.nextInt();
			String[] course = new String[i];
			String[] score = new String[i];
			for (int y = 0; y < i; y++) {
				System.out.println("请输入课程说明：");
				
				course[y] = scanner.next();	
				
				System.out.println("是否有等级【y: 有  /n:没有】");
				
				String bl = scanner.next();
				if (bl.equals("y")) {
					System.out.println("请输入等级号【ABCD】");
					String rank = scanner.next();
					score[y] = rank;
				} else if (bl.equals("n")) {
					score[y] = "没有等级";
				}
			}
			stu[x].setCourses(course);
			stu[x].setScores(score);
		}
          for(int i=0;i<stu.length;i++) {
        	  stu[i].showStudents();
          }
	}

}
