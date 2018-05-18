package homework.javaoopch12;

public class State extends Person {
    protected String stateName;

	public State() {
		super();
		this.stateName="中国";
	}

	public State(String name, String sex, int age,String stateName) {
		super(name, sex, age);		
		this.stateName=stateName;
	}
	
	public void showMessage() {		
		System.out.println(name+"\n"+sex+"\n"+age+"\n"+stateName+"\n");
	}
    
}
