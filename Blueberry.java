package Exercise4_1;

public class Blueberry extends Fruit{
	private String size;//s
	private int vitaminK;//vK
	
	public Blueberry(String name, String s, int vK) {
		super(name);
		this.size = s;	
		this.vitaminK= vK;
		System.out.println("Blueberry constructor is invoked");
	}
	
	public String getSize() {
		return this.size;
	}
	
	public int getVitaminK() {
		return this.vitaminK;
	}
}
