package Interfaz;

import java.util.ArrayList;
import java.util.Arrays;

import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.MapPolygonImpl;

import logicaMapa.Clusters;
import logicaMapa.Grafo;
import logicaMapa.AGM;
import logicaMapa.Arista;

public class InterfazLineas {
	Clusters cluster;
	
	public InterfazLineas(){
	}
	
	public void bufferLineas(Grafo grafo,JMapViewer jmap) {
		jmap.removeAllMapPolygons();
		cluster = new Clusters(new AGM(grafo));
		ArrayList<MapPolygonImpl> rutaMasCorta = new ArrayList<MapPolygonImpl>();
		Coordinate origen;
		Coordinate destino;
		for (Arista arista : cluster.getAristas()) {
			origen=new Coordinate(arista.getOrigen().getLongitud(),arista.getOrigen().getLatitud());
			destino=new Coordinate(arista.getDestino().getLongitud(),arista.getDestino().getLatitud());
			ArrayList<Coordinate> route = new ArrayList<Coordinate>(Arrays.asList(origen, destino, destino));
			rutaMasCorta.add(new MapPolygonImpl(route));
		}
		for (MapPolygonImpl mapPolygonImpl : rutaMasCorta) {
			jmap.addMapPolygon(mapPolygonImpl);
		}
	}
	
	
	
	
}
