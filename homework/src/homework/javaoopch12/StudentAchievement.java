package homework.javaoopch12;

public class StudentAchievement extends Subject_Score {
  public StudentAchievement(double s1, double s2, double s3, double s4) {
		super(s1, s2, s3, s4);		
	}

public void print() {
	  System.out.println(sub1+":"+s1);
	  System.out.println(sub2+":"+s2);
	  System.out.println(sub3+":"+s3);
	  System.out.println(sub4+":"+s4);
	  System.out.println("平均成绩："+getAverage());
	  System.out.println("总成绩："+getSum());
	  System.out.println("老师的评语:"+getRemark());
  }
}
