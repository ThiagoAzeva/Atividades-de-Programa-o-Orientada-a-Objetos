package POO;
import java.util.Scanner;
public class Conta {

	String nomeDoCorrentista;
	int numeroDaConta;
	int montante;
	int deposito;
	int saque;
	
	public void inserir(String n, int nc, int m) {
		nomeDoCorrentista = n;
		numeroDaConta = nc;
		montante = m;
	}
	
	public void depositar(int d, int nc) {
		numeroDaConta = nc;
		deposito = d;
		montante += d;
		System.out.println("Você adicionou " +deposito+ " na conta " +nc );
	}
	
	public void sacar (int nc, int s) {
		numeroDaConta = nc;
		saque = s;
		System.out.println("Você Sacou " +s+ " da conta " +nc);
		montante -= s; 
		 
	}
	
	public void verificarSaldo(int nc) {
		numeroDaConta = nc;
		System.out.println("O saldo Atual da Conta " +nc+ " é "  +montante);
	}
	
	public void exibir() {
		  
		System.out.println(nomeDoCorrentista+ ", " +numeroDaConta);
	}
	
	public static void main(String[] args) {
	Conta c1 = new Conta();
	Scanner sc = new Scanner(System.in);
	System.out.println("Primeiramente Insira Os Dados Para Acessar E Cadastrar.");
	System.out.println("Nome Do Correntista, Numero Da Conta e Seu Saldo.");
	String nome = sc.nextLine();
	int num = sc.nextInt();
	int sal = sc.nextInt();
	c1.inserir(nome, num, sal);
	c1.exibir();
	int i = 0;
	
	while(i != 2) {
	System.out.println("-----------------");
	System.out.println("Que Açao deseja Realizar:");
	System.out.println("Digite (1) Para depositar Dinheiro na sua Conta.");
	System.out.println("Digite (2) Para Sacar Dinheiro na sua Conta.");
	System.out.println("Digite (3) Para Exibir Saldo Atual Da Conta.");
	int o = sc.nextInt();
	System.out.println("-----------------");
	switch(o) {
	
	case 1: //Depositar
	System.out.println("Digite a quantia que quer depositar e a conta.");
	int d = sc.nextInt();
	int c = sc.nextInt();
	
	c1.depositar(d, c);
	System.out.println("-----------------");
	c1.verificarSaldo(c);
	break;
	
	case 2: //Sacar
		System.out.println("Digite a quantia que quer Sacar e a conta.");	
		int s = sc.nextInt();
		c = sc.nextInt();
		
		c1.sacar(c, s);
		System.out.println("-----------------");
		c1.verificarSaldo(c);
		break;
	
	
	case 3:// verificar saldo
		
		System.out.println("Digite o numero da conta:");
		c = sc.nextInt();
		
		c1.verificarSaldo(c);
		break;
	
	case 4://
	}
	System.out.println("-----------------");
	System.out.println("Digite (1) Para refazer Alguma Açao. (2) se esta satisfeito.");
i = sc.nextInt();

if(i == 2) {
	System.out.println("Obrigado Volte Sempre!");
	break;
}

}
	
	
	
	
	}
}

