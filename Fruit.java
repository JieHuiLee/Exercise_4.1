package Exercise4_1;

public class Fruit {
	private String name;
	
	public Fruit(String name){
		this.name = name;
		System.out.println("\n"+name+ " constructor is invoked.");
		}
	
	public String getName() {
		return name;
	 }		
		
	public String toString() {
		return "\nEat more "+ name + " will be more healthy.";
	 }		

}
