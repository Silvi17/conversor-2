package funcionalidad;

import org.json.JSONObject;

import coversor.ApiMonedas;
import layout.MostrarResultado;

public class OperacionesMonedas extends MostrarResultado {

	private static String lastSelectCurrency = "USD";
	private static double result;
	public static JSONObject apiResponse;
	

	public static void main(String input1, String input2,double value) {
		ApiMonedas api = new ApiMonedas();
		
		if( lastSelectCurrency.toString() != input1.toString() || apiResponse == null) {
			try {
				api.setResult(input1);
				apiResponse = api.getResult();
				lastSelectCurrency = input1;
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}else {
			System.out.println("true");
		}
		if(apiResponse != null) {
	
			if(input1 == input2) {
				result = value;
			}else {
				double r =  apiResponse.getJSONObject("conversion_rates").getDouble(input2);
				result = value * r;
				System.out.println(r);
			}
			}
		System.out.println(apiResponse);
	setText(result);
}
}
