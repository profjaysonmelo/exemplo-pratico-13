/*
 * Utilizando classes abstratas, implementar a hierarquia de funcionários de uma empresa, 
 * onde cada tipo de funcionário ( comum, gerente, diretor, presidente ) 
 * possui uma forma diferente de cálculo do salário;
 */
public class Principal {

	public static void main(String[] args) {
		
		Funcionario f = new Comum("JOÃO");
		f.calcularSalario(40);
		
		System.out.println("Salario " + f.getNome() + ": " + f.getSalario());
		
		f = new Gerente("JOSÉ");
		f.calcularSalario(80);
		
		System.out.println("Salario " + f.getNome() + ": " + f.getSalario());
		
		f = new Diretor("PEDRO");
		f.calcularSalario(150);
		
		System.out.println("Salario " + f.getNome() + ": " + f.getSalario());
		
		f = new Presidente("MANUEL");
		f.calcularSalario(200);
		
		System.out.println("Salario " + f.getNome() + ": " + f.getSalario());

	}
}
