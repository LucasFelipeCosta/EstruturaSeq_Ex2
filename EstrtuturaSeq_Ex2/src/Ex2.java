import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int num;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Por favor, digite um numero ");
		num = teclado.nextInt();
		
		System.out.println("O numero informado foi: " + num);
		
		teclado.close();
	}

}
