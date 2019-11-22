package TestUnitarios;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logicaMapa.AGM;
import logicaMapa.Clusters;
import logicaMapa.Grafo;
import logicaMapa.Punto;

class testLogicaMapa {
	Punto p1= new Punto(1,1);
	Punto p2= new Punto(2,2);
	Punto p3= new Punto(3,3);
	Punto p4= new Punto(4,4);
	Punto p5= new Punto(5,5);
	Punto p6= new Punto(10,10);
	
	Punto p7= new Punto(0,1);
	
	Grafo grafoTest = new Grafo();
	AGM agmTest;
	Clusters clusterTest;
	
	testLogicaMapa(){
		grafoTest.addPunto(p1);
		grafoTest.addPunto(p2);
		grafoTest.addPunto(p3);
		grafoTest.addPunto(p4);
		grafoTest.addPunto(p5);
		grafoTest.addPunto(p6);
		agmTest=new AGM(grafoTest);
		clusterTest=new Clusters(agmTest);
	}
	
	@Test
	void testDistanciaEntreDosPuntos() {
		assertEquals(p5.Distancia(p6),7.0710678118654755);
		assertEquals(p6.Distancia(p5),7.0710678118654755);
		assertEquals(p5.Distancia(p6),p6.Distancia(p5));
	}
	
	
	@Test
	void testDistanciaEntreDosPuntosDiferente() {
		assertFalse(p5.Distancia(p6)==8);
		assertFalse(p5.Distancia(p6)==1);
		assertFalse(p5.Distancia(p6)==6.00);
		assertTrue(p1.Distancia(p7)==1);
	}
	
	@Test
	void testGrafoCantidadVertices() {
		assertEquals(grafoTest.cantidadDeVertices(),6);
	}
	
	@Test
	void testGrafoCantidadAristas() {
		assertEquals(grafoTest.cantidadDeAristas(),15);
	}
	
	@Test
	void testAGMcantidadAristas() {
		assertEquals(agmTest.cantidadDeAristas(),grafoTest.cantidadDeVertices()-1);
	}
	@Test
	void testAGMcantidadVertices() {
		assertEquals(agmTest.getCantidadVertices(),6);
	}
	
	@Test
	void testCantidadClusters() {
		assertEquals(clusterTest.getCantidadCluster(),2);
	}
	
	@Test
	void testClusterCantidadVertices() {
		assertEquals(clusterTest.getCantidadVertices(),6);
	}
	@Test
	void testClusterCantidadAristas() {
		assertEquals(clusterTest.getCantidadAristas(),4);
	}
}
