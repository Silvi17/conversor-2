package funcionalidad;

import javax.swing.JLabel;
import javax.swing.JPanel;

import layout.MostrarResultado;

public class OperacionesDistancia extends MostrarResultado{
	 static double result= 0.0;
	 
	
	public static void main(String input1, String input2,double value) {
		
		if(input1 == input2) {
			 result= value;
		}
		
		if(input1 == "Metros" && input2 == "Kilometros") {
			
			result = value / 1000;
		}
		
		if(input2 == "Metros" && input1 == "Kilometros") {
			
			result = value * 1000;
		}
		
		if(input1 == "Millas" && input2 == "Kilometros") {
			
			result = value * 1.621371 ;
		}
		
		if(input2 == "Millas" && input1 == "Kilometros") {
			
			result = value  * 0.62137;
		}
		
		if(input1 == "Millas" && input2 == "Metros") {
		
			result = value * 1621.37 ;
		}
		
		if(input2 == "Millas" && input1 == "Metros") {
			
			result = value  * 0.0006213;
		}
		setText(result);
	}
	}
	

