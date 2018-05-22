package homework.javaoopch15;

public class CPTest {

	public static void main(String[] args) {	
		CPShop.kaiJiang();
		Person person=new Person("马云",0);
		while(true) {
		person.buyCP();
		person.setAccount(CPShop.duiJiang(person.getCp())); 
		int[] cpnum= person.getCp().getCpnum();
		System.out.print("买的号码:");
		for(int i=0;i<7;i++) {
			System.out.print(cpnum[i]+" ");
		}
		System.out.print("\n开奖号码:");
		for(int i=0;i<7;i++) {
			System.out.print(CPShop.zjhm[i]+" ");
		}
		System.out.println("\n账户金额："+person.getAccount());
		}
	}

}
