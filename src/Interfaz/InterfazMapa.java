package Interfaz;
import java.awt.BorderLayout;

import javax.swing.JPanel;
import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import logicaMapa.Grafo;

public class InterfazMapa {
	private JMapViewer jmap;
	private ControlMapa controlmapa;
	
	InterfazMapa(){
		jmap = new JMapViewer();
		controlmapa = new ControlMapa();
		jmap.setZoomControlsVisible(false);
		jmap.setMapMarkerVisible(true);
		jmap.setMapPolygonsVisible(true);
		jmap.setBounds(0, 0, 639, 639);
		jmap.setLayout(new BorderLayout(0, 0));
	}
	
	public void bufferMapa(JPanel contentPane,Grafo grafo) {
		contentPane.add(jmap);
		Coordinate coordenadaInicial = new Coordinate(-34.5271010823766,-58.709564208984375);
		jmap.setDisplayPosition(coordenadaInicial,15);
		controlmapa.bufferMouse(jmap,grafo);
	}
	
	public double getLatitud() {
		return jmap.getPosition().getLat();
	}
	
	public double getLongitud() {
		return jmap.getPosition().getLon();
	}
	
	public int getZoom(){
		return jmap.getZoom();
	}
	
	public JMapViewer getJMap() {
		return jmap;
	}
	
}
