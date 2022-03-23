
public abstract class Funcionario {

	private String nome;
	private Double salario;
	
	public Funcionario(String nome) {
		this.nome = nome;
	}
	public Funcionario() {
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public abstract void calcularSalario(int numeroHoras);
}
