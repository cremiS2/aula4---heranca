package entidade;

public class ContaCorrente extends Conta {

	private double limite;

	public ContaCorrente(String nome, int numero, double saldo, double limite) {
		super(nome, numero, saldo);
		this.limite = limite;
	}

	
	public String toString() {
		return "ContaCorrente " + mostrar() + " limite = " + limite + " \n";
	}
		
	}


