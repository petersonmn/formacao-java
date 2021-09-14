package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

//		System.out.println("X");
//		System.out.println(2);
//		System.out.println(false);

		Object cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(22, 33);

		System.out.println(cc);
		System.out.println(cp);

		println(cc);
	}

	static void println() {}
	static void println(int a) {}
	static void println(boolean valor) {}
	static void println(Object referencia) {}

}