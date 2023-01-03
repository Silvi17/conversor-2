package layout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import enums.Variable;
import enums.VariablesDistancia;
import enums.VariablesMoneda;
import enums.VariablesTemperatura;
import funcionalidad.Operaciones;

public class SelectTypeConvert extends Operaciones {

	public JComboBox<?> selectConvert;
	SelectorUnits seleccionador1;
	SelectorUnits seleccionador2;

	public static int lastSelect;

	String[] temperatura = VariablesTemperatura.temperaturas();
	String[] distancias = VariablesDistancia.distacias();
	String[] monedas = VariablesMoneda.monedas();

	public void listaSeleccionarConversor(JPanel panel) {
		Variable[] arr = Variable.values();

		selectConvert = new JComboBox<Object>(arr);
		selectConvert.setBounds(75, 60, 290, 30);

		seleccionador1 = new SelectorUnits(panel, 1);
		seleccionador2 = new SelectorUnits(panel, 2);

		seleccionador1.setBound(275, 120);
		seleccionador2.setBound(275, 200);

		panel.add(selectConvert);
	}

	public void getCurrentSelection(final JLabel label) {
		ActionListener oyente = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String value = selectConvert.getSelectedItem().toString();
				label.setText("Conversor de " + value);

				switch (value) {
				case "Temperatura":
					setVariablePrincipal("Temperatura");
					seleccionador1.changeList(temperatura, "Temperatura");
					seleccionador2.changeList(temperatura, "Temperatura");
					break;
				case "Moneda":
					setVariablePrincipal("Moneda");
					seleccionador1.changeList(monedas, "Moneda");
					seleccionador2.changeList(monedas, "Moneda");
					break;
				case "Distancia":
					setVariablePrincipal("Distancia");
					seleccionador1.changeList(distancias, "Distancia");
					seleccionador2.changeList(distancias, "Distancia");
				default:
					break;
				}
			}
		};
		selectConvert.addActionListener(oyente);
	}
}
