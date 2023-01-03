package layout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import enums.VariablesDistancia;
import enums.VariablesMoneda;
import funcionalidad.Operaciones;


public class SelectorUnits extends Operaciones {

	private String[] typeConvert;
	public  JComboBox<String> select;
	private	String[] moneda = VariablesMoneda.monedas();
	public static int lastSelect;
	public int num;
	
	public SelectorUnits(JPanel panel, int number){
		setTypeConvert(moneda);
		num = number;
		listaDesplegable(panel);
		getSelector();	
	}
	
	public void listaDesplegable(JPanel panel) {
		 select = new JComboBox<String>(typeConvert); 
		 panel.add(select);
	}
	
	public void setTypeConvert(String[] value){
		this.typeConvert = value;
	
	}
	public void changeList(String[] list,String v) {
		
		select.removeAllItems();
		for(String value : list) {
			select.addItem(value);
		}
		if(list[0].length() <4 && num ==1) {
		select.setSelectedIndex(lastSelect);
		}
	}

	public void setBound(int a, int b) {
		select.setBounds(a , b ,90 ,40);
	}
	
	public void getSelector() {
		ActionListener oyente  = new ActionListener() {	
			@Override
			public  void actionPerformed(ActionEvent e) {
				if(select.getSelectedItem() == null) {
				
				}else {
					if(select.getSelectedItem().toString().length() < 4 && num == 1 && select.getItemCount() > 1) {
					lastSelect = select.getSelectedIndex();
					}
					getVariables(num,  select.getSelectedItem().toString());
				}
			}
		};
		select.addActionListener(oyente);
	}
	
	
	
}
