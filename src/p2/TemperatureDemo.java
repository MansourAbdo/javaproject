package p2;

import java.util.Scanner;
public class TemperatureDemo {
	public static void main(String[] args) {
		double fahrtemp;	// for fahrenheit temp
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a Temperature in fahrenheit:");
		fahrtemp = input.nextDouble();
		
		Temperature temp = new Temperature(fahrtemp);
		
		temp.setFahrenheit(fahrtemp);
		System.out.println("The temperature in Fahrenheit is " + temp.getFahrenheit());
		System.out.println("The temperature in Celsius is " + temp.getCelsius());
		System.out.println("The temperature in Kelvin is " + temp.getKelvin());
	}

}
