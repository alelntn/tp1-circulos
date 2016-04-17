package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

	
	@Test
	public void crearUnCirculoConRadio2() {
		
		Circulo circuloConRadio2 = new Circulo (2.0) ;
				
		assertEquals(2.0, circuloConRadio2.obtenerRadio(), 0.01) ;
	}
	
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		
		Circulo circuloConRadio3Punto7 = new Circulo (3.7) ;
		
		assertEquals (3.7, circuloConRadio3Punto7.obtenerRadio(), 0.01) ;
	}
	
	
	@Test
	public void crearUnCirculoConRadio5() {
		
		Circulo circuloConRadio5 = new Circulo (5.0) ;
		
		assertEquals (5.0, circuloConRadio5.obtenerRadio(), 0.01) ;
		
	}
	
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
			
		Circulo circuloConRadio10Punto9 = new Circulo (10.9) ;
		
		assertEquals (10.9, circuloConRadio10Punto9.obtenerRadio(), 0.01) ;
	}
	
	
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es301Punto71() {
		
		Circulo circuloConRadio9Punto8 = new Circulo (9.8) ;
		
		assertEquals (301.71, circuloConRadio9Punto8.calculoDeArea(), 0.01) ;
		
	}
	
	
	@Test
	public void queElAreaDeUnCirculoConRadio16Punto6es865Punto69() {
		
		Circulo circuloConRadio16Punto6 = new Circulo (16.6) ;
		
		assertEquals (865.69, circuloConRadio16Punto6.calculoDeArea(), 0.01) ;
	}
	
	
			
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio9Punto8Es61Punto57() {
		
		Circulo circuloConRadio9Punto8 = new Circulo (9.8) ;
		
		assertEquals (61.57, circuloConRadio9Punto8.calculoDePerimetro(), 0.01) ;
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio16Punto6es104Punto30() {
		
		Circulo circuloConRadio16Punto6 = new Circulo (16.6) ;
		
		assertEquals (104.30, circuloConRadio16Punto6.calculoDePerimetro(), 0.01) ;
	}
	
}
