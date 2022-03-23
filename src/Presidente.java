
public class Presidente extends Funcionario{
	
	public Presidente() {
		super();
	}

	public Presidente(String nome) {
		super(nome);
	}
	
	@Override
	public void calcularSalario(int numeroHoras) {
		setSalario(numeroHoras * 400.0);
	}

	
}
