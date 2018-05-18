package homework.javaoopch12;

public class CarHonda extends Car {
     private String  produce;
 
   
	public CarHonda() {
		this("银色");
	}
	
     public CarHonda(String color) {
    	 produce="广州本田";
    	 this.color=color;
	}
     public CarHonda(String color,String model,String produce) {
    	super(color,model);
    	this.produce=produce;
	}
    public void display() {
    	System.out.println(produce+"\n"+color+"\n"+model+"\n");
    }
}
