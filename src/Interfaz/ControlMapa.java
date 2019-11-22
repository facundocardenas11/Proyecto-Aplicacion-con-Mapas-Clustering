package Interfaz;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;
import logicaMapa.Grafo;
import logicaMapa.Punto;

public class ControlMapa {
	
	ControlMapa(){
	}
	
	void bufferMouse(JMapViewer jmap,Grafo grafo) {
		jmap.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
			if (e.getButton() == MouseEvent.BUTTON1)
			{
				Coordinate markeradd = (Coordinate) //borrar
				jmap.getPosition(e.getPoint());
				MapMarkerDot marked =new MapMarkerDot(markeradd);//borrar
				jmap.addMapMarker(marked); //borrar
				Punto puntoNuevo = new Punto(markeradd.getLon(),markeradd.getLat()); //modificar
				grafo.addPunto(puntoNuevo); //borrar
			}}
		});
	}

}
