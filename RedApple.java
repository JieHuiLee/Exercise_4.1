package Exercise4_1;

public class RedApple extends Apple{ //Create another sub-class under Apple
	private double weight;//w
	private int nutrient;//n
	
	public RedApple(String name,double p, int q, double w, int n) {
		super(name,p,q);
		this.weight = w;
		this.nutrient = n;
		
		System.out.println(name + " constructor is invoked");
	}
	
	public double calTotalWeight(){
		return super.quantity * this.weight;
	}
	
	public int getNutrient() {
		return this.nutrient;
	 }	
	
	public double calSumPrice() {
		  return super.price * super.quantity;
	}
	

}
