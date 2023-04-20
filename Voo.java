package POO;
import java.util.Scanner;
public class Voo {
Scanner sc = new Scanner(System.in);
String compania ,origem, destino, dataVoo, horaVoo;
int numeroVoo;
boolean[] cadeiras = new boolean[100];
int assento;
public void Voo(String c, String o, String d, String dv, String hv, int nv) {
	compania = c; 
	origem = o;
	destino = d;
	dataVoo = dv;
	horaVoo = hv;
	numeroVoo = nv;
}

public boolean ocupar (int a) {
	assento = a;
	
	for(int i = 0; i <= 1; i++ ) {
		
		if(!cadeiras[a-1]) {
			
			cadeiras[a-1]= true;
			System.out.println("Reservada com sucesso.");
			return  true;
		
		}
		
}
	System.out.println("Este Assento está ocupado. O proximo assento livre é: " +proximaLivre());
	return false;

}

public int proximaLivre() {
	
	for(int i = 0; i < cadeiras.length; i++) {
		if(!cadeiras[i]) {
			return i + 1;
		}
	
	}
	return assento;
	
}


public boolean verifica() {
    int i=0;
	if(!cadeiras [i]) {
    	cadeiras [i] = true;
    	System.out.println("Cadeira Livre");
    	return true;
}
	return false;

}

public int vagas() {
	int cd = 0;// cd = cadeiras disponiveis
	for(boolean assento: cadeiras) {
		if(!assento) {
			cd++;
		}
	}
	return cd;
}

public String getData() {
	return dataVoo; 
}

public int getVoo() {
	return numeroVoo; 
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);	
Voo v1 = new Voo();
String  c, or, d, dv, hv;
int a, nv;
int o = 0;
int f = 0;
	System.out.println("Digite aqui as informações do seu voo.");
	System.out.println("-----------");
	System.out.println("Compania:");
	c = sc.next();
	System.out.println("-----------");
	System.out.println("Origem:");
	or =sc.next();
	System.out.println("-----------");
	System.out.println("Destino:");
	d = sc.next();
	System.out.println("-----------");
	System.out.println("Data do seu Voo:");
	dv = sc.next();
	System.out.println("-----------");
	System.out.println("Hora do seu Voo:");
	hv = sc.next();
	System.out.println("-----------");
	System.out.println("Numero do voo:");
	nv = sc.nextInt();
	v1.Voo(c, or, d, dv, hv, nv);
	System.out.println("-----------");
	System.out.println("Tem disponiveis " +v1.vagas()+ " cadeiras para esse Voo." );
	System.out.println("-----------");		

while(o != 2) {
		System.out.println("Digite o numero da cadeira que deseja ocupar: ");
		a = sc.nextInt();
		
		v1.ocupar(a);
		
	System.out.println("Digite 1 pra fazer de novo 2 caso tenha encerrado suas reservas.");
	o = sc.nextInt();
	if(o == 2) {
		System.out.println("Obrigado por reservar cadeira/s no Voo "+ v1.getVoo()+ " do dia " +v1.getData()+ ". Volte Sempre.");
	}
	
}

		
	}

}


