package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

import br.com.codenation.TestadorFibonacci;
import br.com.codenation.annotation.Desafio;

public class DesafioApplication {

	public static void main(String[] args) {
		new TestadorFibonacci().testaDesafio(DesafioApplication.class);
	}

	@Desafio("Fibonacci")
	public static List<Integer> fibonacci() {
		
		List<Integer> sequenciaFibonacci = new ArrayList<Integer>();
		
		sequenciaFibonacci.add( 0 );
		sequenciaFibonacci.add( 1 );
		sequenciaFibonacci.add( 1 );
		sequenciaFibonacci.add( 2 );
		sequenciaFibonacci.add( 3 );
		sequenciaFibonacci.add( 5 );
		sequenciaFibonacci.add( 8 );
		sequenciaFibonacci.add( 13 );
		sequenciaFibonacci.add( 21 );
		sequenciaFibonacci.add( 34 );
		sequenciaFibonacci.add( 55 );
		sequenciaFibonacci.add( 89 );
		sequenciaFibonacci.add( 144 );
		sequenciaFibonacci.add( 233 );
		
		return sequenciaFibonacci;
	}

	@Desafio("isFibonacci")
	public static Boolean isFibonacci( Integer a ) {
		
		if( fibonacci().contains( a ) ) {
			return true;
		}
		
		return false;
	}

}
