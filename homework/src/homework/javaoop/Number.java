package homework.javaoop;

public class Number {
  private int n1,n2;
  public Number(int x,int y) {
	  n1=x;
	  n2=y;
  }
  public int add() {
	  return n1+n2;
  }
  public int sub() {
	  return n1-n2;
  }
  public int mul() {
	  return n1*n2;
  }
  public int div() {
	  return n1/n2;
  }
}
