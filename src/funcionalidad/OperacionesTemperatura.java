package funcionalidad;

import layout.MostrarResultado;

public class OperacionesTemperatura extends MostrarResultado{
static double resultTemperatura = 0.0;
	 
	
	public static void main(String input1, String input2,double value) {
		
		if(input1 == input2) {
			resultTemperatura = value;
			
		}
	
	if(input1 == "Celsius" && input2 == "Fahrenheit") {
		
		resultTemperatura = (value * 9/5) + 32;
	}
	
	if(input2 == "Celsius" && input1 == "Fahrenheit") {
		
		resultTemperatura = (value - 32) * 5/9;
	}
	
	if(input1 == "Celsius" && input2 == "Kelvin") {
		
		resultTemperatura = value + 273.15;
	}
	
	if(input2 == "Celsius" && input1 == "Kelvin") {
		
		resultTemperatura = value  - 273.15;
	}
	
	if(input1 == "Fahrenheit" && input2 == "Kelvin") {
	
		resultTemperatura = (value - 32) * 5/9 + 273.15;
	}
	
	if(input2 == "Fahrenheit" && input1 == "Kelvin") {
		
		resultTemperatura = (value - 273) * 9/5 + 32;
	}
	setText(resultTemperatura);
	
}
}
