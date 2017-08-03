package basicas;
import java.util.Scanner;
public class Cezar_in {
	public static void main(String args[]) {
		Scanner entrada=new Scanner(System.in);
		System.out.print("Entrada da Mensagem: ");
		String x=entrada.nextLine();

		x=x.replace('a','D');
		x=x.replace('b','E');
		x=x.replace('c','F');
		x=x.replace('d','G');
		x=x.replace('e','H');
		x=x.replace('f','I');
		x=x.replace('g','J');
		x=x.replace('h','K');
		x=x.replace('i','L');
		x=x.replace('j','M');
		x=x.replace('k','N');
		x=x.replace('l','O');
		x=x.replace('m','P');
		x=x.replace('n','Q');
		x=x.replace('o','R');
		x=x.replace('p','S');
		x=x.replace('q','T');
		x=x.replace('r','U');
		x=x.replace('s','V');
		x=x.replace('t','W');
		x=x.replace('u','X');
		x=x.replace('v','Y');
		x=x.replace('w','Z');
		x=x.replace('x','A');
		x=x.replace('y','B');
		x=x.replace('z','C');
		x=x.toLowerCase();
		
		System.out.print("Mensagem Criptografada: ");
		System.out.println(x);
	}
}