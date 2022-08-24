
public class ContaCorrente extends Conta {

	private double TAXA_DE_TRANSFERENCIA = 0.2;

	// Chama o construtor especifico da classe mãe Conta
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valorDoSaque) {
		double valorDoSaqueComTaxaDeTransferencia = valorDoSaque + TAXA_DE_TRANSFERENCIA;
		return super.saca(valorDoSaqueComTaxaDeTransferencia);
	}

	@Override
	public void deposita(double valor)  {
		super.saldo += valor;
	}
}
