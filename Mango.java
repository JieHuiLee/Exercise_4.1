package Exercise4_1;

public class Mango extends Fruit{
	private String color;//c
	private double vitaminC;//v
	
	public Mango(String name, String c, double v) {
		super(name);
		this.color = c;
		this.vitaminC = v;
		
		System.out.println(name + " constructor is invoked");
	}
	
	public String getColor() {
		return this.color;
	}
	
	public double getVitaminC() {
		return this.vitaminC;
	}
}
