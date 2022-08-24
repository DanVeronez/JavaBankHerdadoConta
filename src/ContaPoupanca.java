
public class ContaPoupanca extends Conta {
	
	// Chama o construtor especifico da classe Conta
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor)  {
		super.saldo += valor;
	}
}
