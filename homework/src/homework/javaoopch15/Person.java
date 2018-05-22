package homework.javaoopch15;

public class Person {
	private String name;
	private static double account;
	private  CP cp;

	public Person(String name, double account) {

		this.name = name;
		this.account = account;
	}

	public void buyCP() {
      this.cp=new CP();
   
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAccount() {
		return account;
	}

	public void setAccount(double account) {
		this.account += account;
	}

	public CP getCp() {
		return cp;
	}

	public void setCp(CP cp) {
		this.cp = cp;
	}

	

}
