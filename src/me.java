import java.util.Locale;
import java.util.Scanner;

public class me{
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float n1,n2,n3,n4,me;
		System.out.printf("Primeira nota: ");
		n1 = sc.nextFloat();
		System.out.printf("Segunda nota: ");
		n2 = sc.nextFloat();
		System.out.printf("Terceira nota: ");
		n3 = sc.nextFloat();
		System.out.printf("Quarta nota: ");
		n4 = sc.nextFloat();
		me = (n1+n2+n3+n4)/4;
		System.out.println("Sua media escolar é " + me);
		if(me >= 7) {
			System.out.println("Voce foi APROVADO. ");
		} else{
			System.out.println("Voce foi REPROVADO. ");
		}	
		sc.close();
}
}