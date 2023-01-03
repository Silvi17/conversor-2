package layout;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import funcionalidad.Operaciones;

public class Input extends Operaciones {
	public JTextField numberInput;
	public Operaciones operaciones;

	public Input() {

		numberInput = new JTextField();
		numberInput.setBounds(75, 120, 180, 40);
		numberInput.setHorizontalAlignment(SwingConstants.CENTER);
		Font fuente = new Font("Courier", Font.ITALIC, 18);
		numberInput.setFont(fuente);
		detector();

	}

	public void setPanel(JPanel panel) {
		panel.add(numberInput);
		BotonConvertir(panel);
	}

	public void detector() {
		KeyListener eventTeclado = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				senValue();
			}

			@Override
			public void keyPressed(KeyEvent e) {
			}
		};

		numberInput.addKeyListener(eventTeclado);

	}

	public void BotonConvertir(JPanel panel) {
		JButton buton1 = new JButton("Convertir");

		buton1.setBounds(140, 270, 150, 37);
		buton1.setFont(new Font("Times New Roman", 4, 16));
		panel.add(buton1);

		ActionListener oyente = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				senValue();
			}
		};
		buton1.addActionListener(oyente);
	}

	public void senValue() {
		double v = 0;

		try {
			v = Integer.parseInt(numberInput.getText());
			getValueTyped(v);
		} catch (Exception e2) {
			e2.printStackTrace();
			numberInput.setText(numberInput.getText().substring(0, numberInput.getText().length() - 1));
		}
		System.out.println(v);
	}

}