package javaproject;

public class TestCarDemo {

	public static void main(String[] args) {

		FuelGauge fg = new FuelGauge(0);
		        
		Odometer od = new Odometer(999900, fg);
		
		for (int x = 0; x < fg.maxGallons; x++) {
	        fg.addFeul();
	    }
		
		 while (fg.getgallons() > 0) {
			 od.addMileage();
			 
			 System.out.println("Mileage: " + od.getMileage());
			 
			 System.out.println("Fuel tank level: " + fg.getgallons() + " gallons");
		        System.out.println("______________________");

		 }

	}

}
