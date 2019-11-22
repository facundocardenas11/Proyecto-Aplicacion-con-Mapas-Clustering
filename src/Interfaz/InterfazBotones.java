package Interfaz;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import logicaMapa.AGM;
import logicaMapa.Clusters;
import logicaMapa.Grafo;

public class InterfazBotones {
	Button button;
	Button button2;
	
	InterfazBotones(){
		button = new Button("Información");
		button2 = new Button("CrearClusters");
	}
	
	void bufferBotones(JPanel contentPane) {
		button.setActionCommand("Información");
		button.setBounds(754, 73, 100, 22);
		contentPane.add(button);
		button2.setActionCommand("CrearClusters");
		button2.setBounds(754, 101, 100, 22);
		contentPane.add(button2);	
	}
	
	void accionesBoton1(InterfazTexto text,Grafo grafo) {
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text.accionesTexto(grafo);
			}
		});
	}
	void accionesBoton2(InterfazTexto text,InterfazLineas lineas,Grafo grafo,InterfazMapa jmap){
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lineas.bufferLineas(grafo, jmap.getJMap());
				text.accionesTexto(new Clusters(new AGM(grafo)));
			}
		});
	}
	
}