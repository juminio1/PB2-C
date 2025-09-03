package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void dadoQueExisteUnaCalculadoraQueSumeDosNumerosEnterosEntoncesDaComoResultadoUnNumeroEntero() {

		Integer numeroUno = 2;
		Integer numeroDos = 3;

		Calculadora prueba = new Calculadora(numeroUno, numeroDos);
		Integer resultadoEsperado = numeroUno + numeroDos;
		Integer resultadoObtenido = prueba.sumarNumerosEnteros(numeroUno, numeroDos);

		assertEquals(resultadoEsperado, resultadoObtenido);

	}

	@Test
	public void dadoQueExisteUnaCalculadoraQueResteDosNumerosEnterosEntoncesDaComoResultadoUnNumeroEntero() {

		Integer numeroUno = 2;
		Integer numeroDos = 3;

		Calculadora prueba = new Calculadora(numeroUno, numeroDos);
		Integer resultadoEsperado = numeroUno - numeroDos;
		Integer resultadoObtenido = prueba.restarNumerosEnteros(numeroUno, numeroDos);

		assertEquals(resultadoEsperado, resultadoObtenido);

	}

	@Test
	public void dadoQueExistaUnaCalculadoraQueMultipliqueDosNumerosEnterosEntoncesDaComoResultadoUnNumeroEntero() {
		Integer numeroUno = 2;
		Integer numeroDos = 3;

		Calculadora prueba = new Calculadora(numeroUno, numeroDos);
		Integer resultadoEsperado = 6;
		Integer resultadoObtenido = prueba.multiplicarNumerosEnteros(numeroUno, numeroDos);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test 
	public void dadoQueExisteUnaCalculadoraQueDividaEntreDosNumerosEnterosDaComoResultadoUnNumero() {
		
		Integer numeroUno = 2;
		Integer numeroDos = 3;
		
		Calculadora prueba = new Calculadora(numeroUno, numeroDos);
		int resultadoEsperado = numeroUno / numeroDos;
		int resultadoObtenido = prueba.dividirNumerosEnteros(numeroUno,numeroDos);
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}

}
