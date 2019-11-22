package logicaMapa;

public class Arista {
	private double peso;
	private Punto origen;
	private Punto destino;
	
	public Arista(Punto origen,Punto destino){
		this.origen=origen;
		this.destino=destino;
		peso=origen.Distancia(destino);
	}
	
	public double getPeso() {
		if(this.equals(null)) {
			return 0;
		}
		return peso;
	}
	
	public Punto getOrigen() {
		return origen;
	}
	
	public Punto getDestino() {
		return destino;
	}
	
	@Override
	public String toString() {
		return "Arista [peso=" + peso + ", origen=" + origen + ", destino=" + destino + "]\n";
	}
	
	public boolean perteneceElPuntoAlaArista(Punto punto) {
		if(origen.equals(punto)) {
			return true;
		}
		if(destino.equals(punto)) {
			return true;
		}
		return false;
	}
	
}
