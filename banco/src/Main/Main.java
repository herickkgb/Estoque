package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Banco c1 = new Banco();
		c1.setNumConta(1111);
		c1.setDono("Jubileu");
		c1.abrirConta("CC");
		c1.depositar(1000);
		
		
		Banco c2 = new Banco();
		c2.setNumConta(2222);
		c2.setDono("Creuza");
		c2.abrirConta("CP");
		c2.depositar(650);
		
		c1.estadoAtual();
		c2.estadoAtual();


	}

}
