package logicaMapa;

import java.util.ArrayList;

public class Clusters{
	
	double promedioPesos;
	private ArrayList<Punto> puntos;
	private ArrayList<Arista> aristas;
	
	public Clusters(AGM agm){
		puntos=new ArrayList<Punto>();
		aristas= new ArrayList<Arista>();
		bufferCluster(agm);
		promedio();
		crearClusters();
	}
	private void bufferCluster(AGM agm){
		if(!agm.getPuntos().isEmpty()) {
			for (Punto punto : agm.getPuntos()) {
				puntos.add(punto);
			}
		}
		if(!agm.getAristas().isEmpty()) {
			for (Arista arista : agm.getAristas()) {
				aristas.add(arista);
			}
		}
	}
	
	private void promedio() {
		promedioPesos=0;
		for (Arista arista : aristas) {
			promedioPesos+=arista.getPeso();
		}
		promedioPesos=promedioPesos/aristas.size();
	}
	private void crearClusters() {
		for (int i = 0; i < aristas.size(); i++) {
			if(aristas.get(i).getPeso()>promedioPesos) {
				aristas.remove(i);
				i--;
			}
		}
	}
	public int getCantidadCluster() {
		return puntos.size()-aristas.size();
	}
	public ArrayList<Punto> getPuntos() {
		return puntos;
	}
	public ArrayList<Arista> getAristas() {
		return aristas;
	}
	public int getCantidadVertices(){
		return puntos.size();
	}
	public int getCantidadAristas() {
		return aristas.size();
	}
}
