package ar.edu.unlam.dominio;

public class Calculadora {

	private Integer numeroUno;
	private Integer numeroDos;
	
	public Calculadora( int numeroUno, int numeroDos) {
		this.numeroUno = numeroUno;
		this.numeroDos = numeroDos;
	}

	public Integer sumarNumerosEnteros(int numeroUno, int numeroDos) {
		return numeroUno + numeroDos;
	}
	
	public Integer restarNumerosEnteros(int numeroUno, int numeroDos) {
		return numeroUno - numeroDos;
	}
	public Integer multiplicarNumerosEnteros(int numeroUno, int numeroDos) {
		return numeroUno * numeroDos;
	}
	
	public Integer getNumeroUno() {
		return numeroUno;
	}

	public Integer getNumeroDos() {
		return numeroDos;
	}

	public Integer dividirNumerosEnteros(int numeroUno, int numeroDos) {
		Integer resultado;
		if(numeroDos == 0) {
			resultado = 0;
		}else {
			resultado = numeroUno / numeroDos;
		}
		return resultado;
	}
	
	
	
	
	
}

