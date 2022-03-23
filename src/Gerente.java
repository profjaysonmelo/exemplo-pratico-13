
public class Gerente extends Funcionario{

	public Gerente() {
		super();
	}

	public Gerente(String nome) {
		super(nome);
	}

	@Override
	public void calcularSalario(int numeroHoras) {
		setSalario(numeroHoras * 150.0);
	}

	
}
