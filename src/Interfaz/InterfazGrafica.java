package Interfaz;

import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import logicaMapa.Grafo;


public class InterfazGrafica extends JFrame {
	
	private InterfazTexto jtext;
	private InterfazMapa jmap;
	private JPanel contentPane;
	private InterfazBotones jbotones;
	private InterfazLineas jlineas;
	private Grafo grafo;
	
	public InterfazGrafica() {
		jtext= new InterfazTexto();
		jmap=new InterfazMapa();
		jbotones=new InterfazBotones();
		grafo=new Grafo();
		jlineas= new InterfazLineas();
		setForeground(SystemColor.activeCaption);
		setResizable(false);
		setTitle("Mapa TP2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 10, 1000, 700);
		bufferInterfaz();
	}
	
	void bufferInterfaz(){
		contentPane=new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		jmap.bufferMapa(contentPane,grafo);
		jtext.bufferTexto(contentPane);
		jbotones.bufferBotones(contentPane);
		jbotones.accionesBoton1(jtext, grafo);
		jbotones.accionesBoton2(jtext,jlineas, grafo,jmap);
	}
	
}
