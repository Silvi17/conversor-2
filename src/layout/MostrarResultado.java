package layout;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MostrarResultado {
	public static JLabel label;

	public static void setText(double numero) {

		if (numero >= 0.999) {
			DecimalFormat df = new DecimalFormat("#.00");
			label.setText("" + df.format(numero));
		} else {
			DecimalFormat df = new DecimalFormat("#0.00000");
			label.setText("" + df.format(numero));
		}
	}

	public static void mostrarCargando(String value) {
		label.setText(value);
	}

	public void colocar(JPanel panel) {
		label = new JLabel();

		label.setBounds(100, 200, 150, 40);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		Font fuente = new Font("Courier", Font.BOLD, 18);
		label.setFont(fuente);
		panel.add(label);

	}
};
