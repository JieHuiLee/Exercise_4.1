package Exercise4_1;

public class Apple extends Fruit{
	protected double price;//p
	protected int quantity;//q
	
	public Apple(String name, double p,int q) {
		super(name);
		this.price = p;	
		this.quantity = q;	
		
		System.out.println(name+ " constructor is invoked.");
	}
	
	public double calTotalPrice() {
		  return this.price * this.quantity;
	 }
	
	public String toString() {
		return "\nPrice\t: RM "+ price + " \nQuantity: "+ quantity;
	}
	
	 
}
