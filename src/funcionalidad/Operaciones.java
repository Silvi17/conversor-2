package funcionalidad;

import javax.swing.JPanel;

public class Operaciones {


	public static String variablePrincipal = "Moneda";
	public int number;
	public static String typeValue1 ="USD";
	public static String typeValue2 = "USD";
	public static double indexMoneda=0;
	public static int  value1 = 1;
	public static int value2 = 1;
	
	public JPanel colocar(JPanel panel) {
		return panel;
	}

	public static void getVariables(int numeroDeInput, String value) {
	if(numeroDeInput == 1 ) {
		typeValue1 = value;
	}else {
		typeValue2 = value;
	}
	}
	
	public static void setVariablePrincipal(String value) {
		variablePrincipal = value;
	}
	
	public static void getValueTyped(double value) {
		switch (variablePrincipal) {
		case "Moneda":
			OperacionesMonedas.main(typeValue1, typeValue2, value);
			break;
		case "Temperatura":
			OperacionesTemperatura.main(typeValue1, typeValue2, value);
			break;
		case "Distancia":
			OperacionesDistancia.main(typeValue1,typeValue2,value);
			break;
		default:
			break;
		}
	}
}
//String tipoPrincipal, String tipo1, String tipo2