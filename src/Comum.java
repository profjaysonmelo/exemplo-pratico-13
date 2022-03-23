
public class Comum extends Funcionario{
	
	public Comum() {
		super();
	}

	public Comum(String nome) {
		super(nome);
	}
	
	@Override
	public void calcularSalario(int numeroHoras) {
		setSalario(numeroHoras * 40.0);
	}

	
}
