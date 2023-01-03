package enums;

public enum VariablesTemperatura {

	Celsius, Fahrenheit, Kelvin;

	public static String[] temperaturas() {
		int states = VariablesTemperatura.values().length;
		String[] temperaturas = new String[states];

		for (int i = 0; i < states; i++) {
			temperaturas[i] = VariablesTemperatura.values()[i].name();
		}

		return temperaturas;
	}
}
