package Interfaz;
import java.awt.TextField;
import javax.swing.JPanel;

import logicaMapa.AGM;
import logicaMapa.Clusters;
import logicaMapa.Grafo;

public class InterfazTexto {
	private TextField textField1;
	private TextField textField2;
	private TextField textField3;
	private TextField textField4;
	private TextField textField5;
	private TextField textField6;
	private TextField textField7;
	private TextField textField8;
	private TextField textField9;
	private TextField textField10;
	
	InterfazTexto(){
		textField1 = new TextField();
		textField1.setEditable(false);
		textField1.setBounds(754, 130, 178, 22);
		textField2 = new TextField();
		textField2.setEditable(false);
		textField2.setBounds(754, 158, 178, 22);
		textField3 = new TextField();
		textField3.setEditable(false);
		textField3.setBounds(754, 186, 178, 22);
		textField9 = new TextField();
		textField9.setEditable(false);
		textField9.setBounds(754, 214, 178, 22);
		textField10 = new TextField();
		textField10.setEditable(false);
		textField10.setBounds(754, 242, 178, 22);
		textField4 = new TextField();
		textField4.setText("Cant.Vertices");
		textField4.setEditable(false);
		textField4.setBounds(659, 130, 90, 22);
		textField5 = new TextField();
		textField5.setText("Grafo.Aristas");
		textField5.setEditable(false);
		textField5.setBounds(659, 158, 90, 22);
		textField6 = new TextField();
		textField6.setText("AGM.Aristas");
		textField6.setEditable(false);
		textField6.setBounds(659, 186, 90, 22);
		textField7 = new TextField();
		textField7.setText("Clusters.Aristas");
		textField7.setEditable(false);
		textField7.setBounds(659, 214, 90, 22);
		textField8 = new TextField();
		textField8.setText("Cant.Cluster");
		textField8.setEditable(false);
		textField8.setBounds(659, 242, 90, 22);
		
	}
	
	void bufferTexto(JPanel contentPane) {
		contentPane.add(textField1);
		contentPane.add(textField2);
		contentPane.add(textField3);
		contentPane.add(textField4);
		contentPane.add(textField5);
		contentPane.add(textField6);
		contentPane.add(textField7);
		contentPane.add(textField8);
		contentPane.add(textField9);
		contentPane.add(textField10);
	}
	
	void accionesTexto(Grafo grafo){
		textField1.setText(grafo.cantidadDeVertices()+"");
		textField2.setText(grafo.cantidadDeAristas()+"");
		textField3.setText((new AGM(grafo)).getCantidadAristas()+"");
	}
	void accionesTexto(Clusters cluster) {
		textField10.setText(cluster.getCantidadCluster()+"");
		textField9.setText(cluster.getCantidadAristas()+"");
	}
}
