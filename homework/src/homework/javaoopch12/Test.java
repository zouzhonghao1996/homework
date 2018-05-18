package homework.javaoopch12;

public class Test {

	public static void main(String[] args) {
		/*CarHonda car1=new CarHonda("黑色");
        car1.display();
		CarHonda car2=new CarHonda();
        car2.display();
        CarHonda car3=new CarHonda("天津一汽","蓝色","卡车");
        car3.display();*/
      /*  
        State p1=new State();
        p1.showMessage();
        State p2=new State("艾里森","男",41,"美国");
        p2.showMessage();
        State p3=new State("尹继平","女",26,"中国");
        p3.showMessage();
        State p4=new State("宋慧乔","男",22,"韩国");
        p4.showMessage();*/
		
		StudentAchievement stu=new StudentAchievement(80.5,78.5,88.0,91.0);
		stu.setReview();
		stu.print();
	}

}
