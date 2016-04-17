package ar.edu.unlam.tp1;

public class Circulo {
	
	private Double radio ;							//atributo
	
	public Circulo (Double radio){					//constructor
		this.radio = radio ;
	}
	
	public double obtenerRadio(){					//get
		return this.radio ;
	}
	
	public void establecerRadio(Double radio){		//set
		this.radio=radio ;
	}
	
	public Double calculoDePerimetro(){
		return Math.PI * 2 * radio ;
	}
	
	public Double calculoDeArea (){
		return  Math.PI * Math.pow(radio, 2);
	}

}
