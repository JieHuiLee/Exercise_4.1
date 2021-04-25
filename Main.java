package Exercise4_1;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Fruit Shop");
		System.out.print("--------------------------\n");
		
		Fruit obj1 = new Fruit("Fruit");
		System.out.println("\nFruit Detail");
		System.out.print("=============================");
		System.out.println(obj1);		
		System.out.println();
		
		Apple obj2 = new Apple ("Apple",18.80,5);
		System.out.println("\nApple Detail");
		System.out.print("=============================");
		System.out.println(obj2);
		System.out.printf("%-11s%5.2f","Total Price: RM ", obj2.calTotalPrice());	
		System.out.println();
		
		GreenApple obj3 = new GreenApple("Green Apple",30.09,4,"sour", 4.0, 150.00);
		System.out.println("\nGreen Apple Detail");
		System.out.print("=============================");
		System.out.println(obj3);
		System.out.println("Taste\t: "+ obj3.getTaste());		
		System.out.println("pH Value: "+ obj3.getpHValue());		
		System.out.println("Payment\t: RM "+ obj3.getPayment());	
		System.out.printf("%-11s%5.2f","Total Price: RM ", obj3.calSumPrice());		
		System.out.printf("\n%-11s%5.2f","Price after discount (10%): RM ", obj3.calDiscount());		
		System.out.printf("\n%-11s%5.2f","Balance\t   : RM ", obj3.balance());
		System.out.println();
		
		RedApple obj4 = new RedApple("Red Apple",11.90,7,182.00,52);
		System.out.println("\nRed Apple Detail");
		System.out.print("=============================");
		System.out.println(obj4);
		System.out.println("Total Weight\t: "+ obj4.calTotalWeight() +" (grams)");	
		System.out.println("Nutrient\t: "+ obj4.getNutrient() +"calories");	
		System.out.printf("%-11s%5.2f","Total Price\t: RM ", obj4.calTotalPrice());	
		System.out.println();
		
		Mango obj5 = new Mango ("Mango","Vivid yellow",36.4);
		System.out.println("\nMango Detail");
		System.out.print("=============================");
		System.out.println(obj5);
		System.out.println("Color\t: " + obj5.getColor());
		System.out.println("VitaminC: " + obj5.getVitaminC()+" mg");
		System.out.println();
		
		Blueberry obj6 = new Blueberry("Blueberry","Small", 36);
		System.out.println("\nBlueberry Detail");
		System.out.print("=============================");
		System.out.println(obj6);
		System.out.println("Size\t: " + obj6.getSize());
		System.out.println("VitaminK: " + obj6.getVitaminK() + " %");
		System.out.println("\n=======Thank You======");	
		
	}

}
