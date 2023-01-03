package coversor;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import layout.MostrarResultado;

public class ApiMonedas extends MostrarResultado {
	private JSONObject result;
	public static String r;

	public void setResult(String value) {
		try {
			URL url = new URL("https://v6.exchangerate-api.com/v6/098c674309c6dd427ecb9bd6/latest/" + value);
			System.out.println(url);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			con.setRequestMethod("GET");
			con.connect();

			int responseCode = con.getResponseCode();

			if (responseCode != 200) {
				throw new RuntimeException();
			} else {
				StringBuilder informationBuilder = new StringBuilder();
				Scanner scanner = new Scanner(url.openStream());
				while (scanner.hasNext()) {
					informationBuilder.append(scanner.nextLine());
				}
				scanner.close();
				this.result = new JSONObject(informationBuilder.toString());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public JSONObject getResult() {
		return result;
	}

}
