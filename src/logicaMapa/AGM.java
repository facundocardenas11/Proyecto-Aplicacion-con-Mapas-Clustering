package logicaMapa;

import java.util.ArrayList;

public class AGM{
	
	private ArrayList<Punto> puntos;
	private ArrayList<Arista> aristas;
	
	public AGM(Grafo grafo){
		puntos=new ArrayList<Punto>();
		aristas= new ArrayList<Arista>();
		bufferAgm(grafo);
		crearAgm();
	}
	private void bufferAgm(Grafo grafo){
		if(!grafo.getPuntos().isEmpty()) {
			for (Punto punto : grafo.getPuntos()) {
				puntos.add(punto);
			}
		}
		if(!grafo.getAristas().isEmpty()) {
			for (Arista arista : grafo.getAristas()) {
				aristas.add(arista);
			}
		}
	}
	
	private void crearAgm() {
		ArrayList<Arista> agm = new ArrayList<Arista>();
		for (int j = 0;j<puntos.size()-1&&agm.size()<puntos.size()-1; j++) {
			agm.add(null);
		}
		if(!aristas.isEmpty()) {
			for (int i = 0; i < puntos.size()-1; i++) {
				for (int j = 0; j < aristas.size(); j++) {
					if(puntos.get(i).equals(aristas.get(j).getOrigen())){
						if(agm.get(i)==null) {
							agm.set(i,aristas.get(j));
						}else{
							if(aristas.get(j).getPeso()<=agm.get(i).getPeso()) {
								agm.set(i, aristas.get(j));
							}
						}
					}
				}
			}
		}
		aristas.clear();
		reemplaceGrafoToAgm(agm);
	}
	
	private void reemplaceGrafoToAgm(ArrayList<Arista> agm){
		for (Arista arista : agm) {
			aristas.add(arista);
		}
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
	public int getCantidadVertices() {
		return puntos.size();
	}
	public int getCantidadAristas() {
		return aristas.size();
	}
}
