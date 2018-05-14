package homework.javaoopch09;

public class NetUser {
	private String userId;
	private String passWord;
	String email;

	public NetUser(String userId, String passWord, String email) {
		this.userId = userId;
		this.passWord = passWord;
		this.email = email;
	}

	public NetUser(String userId, String passWord) {
		this.userId = userId;
		this.passWord = passWord;
		this.email = this.userId + "@gameschool.com";
	}

	public void showInfo() {
      System.out.println("用户名："+userId+"\n密码:"+passWord+"\n邮箱："+email);
	}
}
