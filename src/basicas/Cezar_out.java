package basicas;
import java.util.Scanner;
public class Cezar_out {
	public static void main(String args[]) {
		Scanner entrada=new Scanner(System.in);
		System.out.print("Entrada da Mensagem Criptografada: ");
		String x=entrada.nextLine();

		x=x.replace('d','A');
		x=x.replace('e','B');
		x=x.replace('f','C');
		x=x.replace('g','D');
		x=x.replace('h','E');
		x=x.replace('i','F');
		x=x.replace('j','G');
		x=x.replace('k','H');
		x=x.replace('l','I');
		x=x.replace('m','J');
		x=x.replace('n','K');
		x=x.replace('o','L');
		x=x.replace('p','M');
		x=x.replace('q','N');
		x=x.replace('r','O');
		x=x.replace('s','P');
		x=x.replace('t','Q');
		x=x.replace('u','R');
		x=x.replace('v','S');
		x=x.replace('w','T');
		x=x.replace('x','U');
		x=x.replace('y','V');
		x=x.replace('z','W');
		x=x.replace('a','X');
		x=x.replace('b','Y');
		x=x.replace('c','Z');
		x=x.toLowerCase();
		
		System.out.print("Mensagem Descriptografada: ");
		System.out.println(x);
	}
}
