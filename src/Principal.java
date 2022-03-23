/*
 * Utilizando classes abstratas, implementar a hierarquia de funcion�rios de uma empresa, 
 * onde cada tipo de funcion�rio ( comum, gerente, diretor, presidente ) 
 * possui uma forma diferente de c�lculo do sal�rio;
 */
public class Principal {

	public static void main(String[] args) {
		
		Funcionario f = new Comum("JO�O");
		f.calcularSalario(40);
		
		System.out.println("Salario " + f.getNome() + ": " + f.getSalario());
		
		f = new Gerente("JOS�");
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
