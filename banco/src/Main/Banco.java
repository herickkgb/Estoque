package Main;

public class Banco {

	// atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	//estado da conta atual
	
	public void estadoAtual() {
		System.out.println("----------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}

	// metodos Pesonalizados

	public void abrirConta(String t) {

		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50f);
		} else if (t == "CP") {
			this.setSaldo(150f);
		}
		System.out.println("Conta aberta com sucesso");

	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta em Débito");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta em débito");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
	}

	public void depositar(int v) {
		if (this.getStatus() == true) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito concluido na Conta " + this.getDono());
		} else {
			System.out.println("Impossivel depositar em uma conta fechada");
		}
	}

	public void sacar(float v) {
		if (this.getStatus() == true) {
			if (this.getSaldo() >= v) {
				saldo = saldo - v;
			} else {
				System.out.println("Saldo insuficiente seu saldo atual e de: " + this.getSaldo());
			}
		} else {
			System.out.println("Impssivel sacar!");
		}
	}

	public void pagarMensalidade() {
		int v = 0;

		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}

		if (this.getStatus() == true) {
			if (this.getSaldo() > v) {
				saldo = saldo - v;
				System.out.println("Mensalidade paga com sucesso: " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente!");
			}

		} else {
			System.out.println("Impossivel pagar");
		}

	}

	// Métodos especiais

	public Banco() {
		this.setSaldo(0);
		this.setStatus(false);
	}

	// getter e setter

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}