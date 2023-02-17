package javaproject;

//Mansour Abdo CPS 121 HW 6

/* purpose of this program is to design a set of classes that work together to simulate a car’s 
fuel gauge and odometer */

public class FuelGauge {
 final int maxGallons = 15 ; 
 
  private int gallons; 
  
  public FuelGauge (int gallons) {
	  if (gallons <= maxGallons) {
            this.gallons = gallons;
        } else 
            gallons = maxGallons;
        
	  
	   }
  public void addFeul() {
	  if (gallons < maxGallons) {
		  gallons= gallons +1;
		  
	  }
	  else 
		  System.out.println("The feul tank is full");
	  

  }
  
  public void useFuel() {
        if (gallons > 0) {
            gallons = gallons -1;
        } else 
            System.out.println("the feul tank is empty");
        
}
  
  public int getgallons() {
	  return gallons;
  }
  
}
  
  

