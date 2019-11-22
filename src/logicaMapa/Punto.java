package logicaMapa;

public class Punto {
	double latitud;
	double longitud;
	
	public Punto(){
	}
	
	
	
	public Punto(double latitud,double longitud) {
		this.latitud=latitud;
		this.longitud=longitud;
	}
	
	public Double Distancia(Punto p2){
		Double distancia;
		distancia=Math.sqrt(Math.pow((p2.getLatitud()-latitud),2)+Math.pow((p2.getLongitud()-longitud),2));
		return distancia;
	}
	
	public double getLatitud() {
		return latitud;
	}
	
	public double getLongitud() {
		return longitud;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		if (Double.doubleToLongBits(latitud) != Double.doubleToLongBits(other.latitud))
			return false;
		if (Double.doubleToLongBits(longitud) != Double.doubleToLongBits(other.longitud))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "[latitud=" + latitud + ", longitud=" + longitud + "]";
	}
	
}
