package homework.javaoop;

public class WuMingFen {
	private String theMa;
	private int quantity;
	private boolean likeSoup;

	public WuMingFen() {
		theMa="酸辣";
		quantity=2;
		likeSoup=true;
	}

	public WuMingFen(String theMa, int quantity) {
		
		this.theMa = theMa;
		this.quantity = quantity;
	}

	public WuMingFen(String theMa, int quantity, boolean likeSoup) {
		
		this.theMa = theMa;
		this.quantity = quantity;
		this.likeSoup = likeSoup;
	}
    public void check() {
    	System.out.println(theMa+" "+quantity+" "+likeSoup);
    }
}
