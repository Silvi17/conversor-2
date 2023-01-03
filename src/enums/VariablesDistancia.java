package enums;

public enum VariablesDistancia {
	Metros,Kilometros,Millas;

	public static String[] distacias() {
	    int states = VariablesDistancia.values().length;
	    String[] names = new String[states];

	    for (int i = 0; i < states; i++) {
	        names[i] = VariablesDistancia.values()[i].name();
	    }
	    return names;
	}
}