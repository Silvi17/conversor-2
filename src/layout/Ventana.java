package layout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import funcionalidad.Operaciones;

public class Ventana extends JFrame {

	public JPanel panel;

	public SelectTypeConvert selectTypeConvert = new SelectTypeConvert();
	public String currentvalue;
	public JLabel label;

	public Ventana() {

		setSize(450, 500);
		setTitle("Conversor de Moneda");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(450, 450));
		iniciarComponentes();
		Operaciones p = new Operaciones();
		p.colocar(panel);

		MostrarResultado r = new MostrarResultado();
		r.colocar(panel);
	}

	private void iniciarComponentes() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.orange);
		this.getContentPane().add(panel);

		Input input = new Input();
		input.setPanel(panel);
		title();

		selectTypeConvert.listaSeleccionarConversor(panel);
		selectTypeConvert.getCurrentSelection(label);
	}

	public void title() {
		label = new JLabel();
		label.setText("Conversor de Moneda");
		label.setOpaque(true);
		label.setBackground(Color.ORANGE);
		label.setForeground(Color.WHITE);
		Font fuente=new Font("Courier", Font.BOLD, 20);
		label.setFont(fuente);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 10, 450, 30);

		panel.add(label);
	}

}
