public class Conta {

	private double 	saldo;
	private int 	agencia;
	private int 	numero;
	private Cliente titular;
	
	private static int contador;
	
	// ************ CONSTRUTOR ESPECIFICO **************
	public Conta(int agencia, int numero){
		Conta.contador++;
		// System.out.println("A classe Conta foi invocado: " + Conta.contador + " Cliente(s) cadastrado(s)");
		this.agencia = agencia;
		this.numero  = numero;
		// this.saldo = 100;
		// System.out.println("Estou criando uma conta " + this.numero);
		
	}
	// ************** METODOS ****************
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valorDoSaque) {
		if (this.saldo >= valorDoSaque) {
			this.saldo -= valorDoSaque;
			return true;
		}
		return false;
	}

	public boolean tranfere(double valorDoSaque, Conta contaDestino) {
		if (valorDoSaque > 0 && this.saldo >= valorDoSaque) {
			saca(valorDoSaque);
			contaDestino.deposita(valorDoSaque);
			return true;
		}
		return false;
	}
	
	public Void preencheTitular(String nome, String cpf, String profissao) {
		this.getTitular().setNome(nome);
		this.getTitular().setCpf(cpf);
		this.getTitular().setProfissao(profissao);
		return null;
	}
	
	public void extrato() {
		if(this.titular.getNome() 	   != null &&
		   this.titular.getCpf() 	   != null &&
		   this.titular.getProfissao() != null) {
				
			System.out.println("==========================");
			System.out.println("Nome:      " + this.titular.getNome());
			System.out.println("CPF:       " + this.titular.getCpf());
			System.out.println("Profissão: " + this.titular.getProfissao());
			System.out.println("Saldo:     R$ " + this.saldo);
			System.out.println("Agencia:   " + this.agencia);
			System.out.println("Numero:    " + this.numero);
			System.out.println("==========================");
	
		}else {
			System.out.println("Preencha os campos Nome, CPF e Profissão!");
		}
	}


	// ************* GETTERS AND SETTERS ***************
	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
