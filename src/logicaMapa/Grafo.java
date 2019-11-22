package logicaMapa;

import java.util.ArrayList;

public class Grafo {
	private ArrayList<Punto> puntos;
	private ArrayList<Arista> aristas;
	 
	public Grafo(){
		puntos = new ArrayList<Punto>();
		aristas = new ArrayList<Arista>();
	}
	
	public void addPunto(Punto p) {
		boolean agregar = true;
		for (Punto punto : puntos) {
			if(p.equals(punto)) {
				agregar=false;
			}
		}
		if(agregar) {
			puntos.add(p);
			addArista(p);
		}
	}
	
	private void addArista(Punto p1){
		if(puntos.size()>1){
			for (int i=0;i<puntos.size()-1;i++) {
				aristas.add(new Arista(puntos.get(i),p1));
			}
		}
	}
	
	public int cantidadDeVertices() {
		return puntos.size();
	}
	
	public int cantidadDeAristas() {
		return aristas.size();
	}
	
	public ArrayList<Punto> getPuntos() {
		return puntos;
	}
	
	public ArrayList<Arista> getAristas() {
		return aristas;
	}
	
	@Override
	public String toString() {
		return "Grafo"+aristas.size()+","+puntos.size()+"[Arista:" + aristas + "]\n";
	}
	
}
