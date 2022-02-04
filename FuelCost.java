import java.util.Scanner;

public class FuelCost {

	public static void main(String[] args) {
		
		
		final double petrolSpends = 6.9/100;
		final double dieselSpends = 5.6/100;
		
		final int costOfPetrol = 7;
		final int costOfDiesel = 6;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Engine type (p/d): ");
		String engineType = keyboard.nextLine();
		
        int distance = 0; 
		
		
		if (engineType.equals("p")) {
			
			System.out.println("Year: ");
		    int yearOfTheCar = keyboard.nextInt();
		    
		     //(2021-year)<= 5 ve 10 olarak deðiþtirildi  
		    
		    System.out.println("Distance: ");
		    distance = keyboard.nextInt();
		    
		    double totalCostForPetrol = petrolSpends*costOfPetrol*distance;
			
		   
		    if (yearOfTheCar <= 2021 && yearOfTheCar >=2017)
		    	System.out.println("Total cost of fuel = " + totalCostForPetrol +" TL");
		    else if (yearOfTheCar <2017 && yearOfTheCar == 2010 )
		    	System.out.println("Total cost of fuel = " + totalCostForPetrol*102/100 +" TL");
		    else 
		    	System.out.println("Total cost of fuel = " + totalCostForPetrol*105/100 +" TL");
		    	
		    }
		
		//totalCostForPetrol*102/100    math roundu deðiþtirirsin
		  
		else if (engineType.equals("d")) {
			
			System.out.println("Year: ");
		    int yearOfTheCar = keyboard.nextInt();
		    
		    System.out.println("Distance: ");
		    distance = keyboard.nextInt();
		    
		    
			double totalCostForDiesel = dieselSpends*costOfDiesel*distance;
		    
		    
		    if (yearOfTheCar <= 2021 && yearOfTheCar >=2017)
		    	System.out.println("Total cost of fuel = " + Math.round((totalCostForDiesel)*1000.0)/1000.0 +" TL");
		    else if (yearOfTheCar <2017 && yearOfTheCar == 2010 )
		    	System.out.println("Total cost of fuel = " + totalCostForDiesel*102/100 +" TL");
		    else 
		    	System.out.println("Total cost of fuel = " + Math.round((totalCostForDiesel*105/100)*1000.0)/1000.0 +" TL");
		    	
		    }
		    
		 else 
		    	System.out.println("Engine type you entered is not valid.");
		
		keyboard.close();

		
	  }
	
	}


