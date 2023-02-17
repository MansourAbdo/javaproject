package p2;

import java.util.Scanner;

public class Temperature 
{
	double fahrtemp;
	Temperature(double fahrtemp)
	{
		this.fahrtemp = fahrtemp;
	}
	public void setFahrenheit(double fahrtemp)
	{
		this.fahrtemp = fahrtemp;
	}
	double getFahrenheit()
	{
		return fahrtemp;
	}
	double getCelsius()
	{
		return ((double)5/9*(fahrtemp-32));
	}
	double getKelvin()
	{
		return (((double)5/9*(fahrtemp-32))+273);
	}
}
