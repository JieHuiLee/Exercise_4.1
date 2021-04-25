package Exercise4_1;

public class GreenApple extends Apple{ //Create another sub-class under Apple
	private String taste;//t
	private double pHValue;//pH
	private double payment;//py
	
	public GreenApple(String name, double p,int q, String t, double pH, double py) {
		super(name,p,q);
		this.taste = t;	
		this.pHValue = pH;	
		this.payment = py;	
		System.out.println(name+ " constructor is invoked.");
	}
	
	public String getTaste() {
		return this.taste;
	}
	
	public double getpHValue() {
		return this.pHValue;
	 }		
	
	 public double getPayment() {
		return payment;
	}
	 
	public double calSumPrice() {
		  return this.price * this.quantity;
	 }
	
	public double calDiscount() {
		return this.calSumPrice() - this.calSumPrice() * 0.10;
     }
	
	public double balance() {
		return this.payment - this.calDiscount() ;
	}

}
