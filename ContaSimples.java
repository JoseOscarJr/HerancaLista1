package heranca;

public class ContaSimples extends Conta {
	private double saldoPoupanca;

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	public boolean depositoPoupanca(double valor) {
		if(valor > 0) {
			saldoPoupanca += valor;
			return true;
		}
		return false;
	}
	public boolean saquePoupanca(double valor) {
		if(valor <= saldoPoupanca) {
			saldoPoupanca -= valor;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append("]");
		return builder.toString();
	}
	
}
