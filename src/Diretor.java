
public class Diretor extends Funcionario{
	
	public Diretor() {
		super();
	}

	public Diretor(String nome) {
		super(nome);
	}
	
	@Override
	public void calcularSalario(int numeroHoras) {
		setSalario(numeroHoras * 300.0);
	}

	
}
