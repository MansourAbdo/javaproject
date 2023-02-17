package javaproject;

public class Odometer {
	//maxMileage constant
	final int maxMilage=999999;
	//miles per gallon constant
	final int mpg= 24;
	
	private int initialMileage;
	
    private int currentMileage;
    
    private FuelGauge fuelGauge;
    
   
    
    public void addMileage() {

        if (currentMileage < maxMilage) {
        	currentMileage = currentMileage + 1;
        } else 
        	currentMileage = 0;
        

        int driven = initialMileage - currentMileage;
        if (driven % mpg == 0) {
            fuelGauge.useFuel();
        }
    }
    
    public Odometer(int currentMileage, FuelGauge fuelGauge) {
        this.initialMileage = currentMileage;
        this.currentMileage = currentMileage;
        this.fuelGauge = fuelGauge;
       
    }
    
    public int getMileage() {
        return currentMileage;
    }
   
}
