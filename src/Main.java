

public class Main {

	public static void main(String[] args) {
		/**
		 * Criando os clientes.
		 */
		Cliente tiago = new Cliente();
		tiago.setNome("tiago");
		
		Cliente lucas = new Cliente();
		lucas.setNome("Lucas");
		
		Cliente maria = new Cliente();
		maria.setNome("Maria");
				 		
		/**
		 * Criando as contas para os clietes.
		 */
		
		Conta ccTiago = new ContaCorrente(tiago);
		Conta cpTiago = new ContaPoupanca(tiago);
	
		Conta ccLucas = new ContaCorrente(lucas);
		
		Conta ccMaria = new ContaCorrente(maria);
		Conta cpMaria = new ContaCorrente(maria);
		
		/**
		 * Realizando as transações e imprimindo as informações.
		 */
		
		ccTiago.depositar(100);	
		ccTiago.transferir(100, cpTiago);
		ccTiago.imprimirExtrato();
		cpTiago.imprimirExtrato();
		
		ccLucas.depositar(500);
		ccLucas.transferir(350, ccMaria);
		ccLucas.imprimirExtrato();
	
		ccMaria.depositar(50);
		ccMaria.sacar(10);
		ccMaria.transferir(350, cpMaria);
		ccMaria.imprimirExtrato();
		cpMaria.imprimirExtrato();
		
	}
}
