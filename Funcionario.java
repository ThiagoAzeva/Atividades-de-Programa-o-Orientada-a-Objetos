package POO;

public class Funcionario {

	String nome;
	double salario;
	int cpf;

	public void inserir(String n,double s,int c) {
		nome = n;
		salario = s;
		cpf = c;
	}
	
	public void exibir() {
		
	System.out.println(nome+"," +salario+ "," +cpf);
		
	}

	
	public static void main(String[] args) {
	Funcionario f1 = new Funcionario(), f2 = new Funcionario();
		
		f1.inserir("Silvia", 3500, 555);
		f2.inserir("Claudia", 3800, 555);
		f1.exibir();
		f2.exibir();
		

	
	}
}





