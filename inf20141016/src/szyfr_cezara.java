import java.util.Scanner;

public class szyfr_cezara {
	
	static Scanner read = new Scanner(System.in);
	static boolean first_run = true;
	static String result;
	//result = code + a + i*b;
	static int a, b;
	
	public static void define_code(){
		System.out.println("Zdefiniuj wartosci przestawienia kodu cezara wg. wzoru litera_poczatkowa + a + numer_litery_w_wyrazie*b = litera_koncowa.");
		System.out.println("Podaj a: ");
		a = read.nextInt();
		System.out.println("Podaj b: ");
		b = read.nextInt();
		
	}
	
	public static void code(){
		String result;
		String uncoded;
		System.out.println("Podaj slowo/zdanie do zakodowania: ");
		uncoded = read.nextLine();
		
		//kod kodujacy
		result = "zakodowane slowo (" + uncoded + ")";
		
		System.out.println("Zakodowane slowo/zdanie: " + result);
	}
	
	public static void decode(){
		String result;
		String coded;
		System.out.println("Podaj zakodowane slowo/zdanie: ");
		coded = read.nextLine();
		
		//kod odkodowujacy
		result = "odkodowane slowo (" + coded + ")";
		
		System.out.println("Odkodowane slowo/zdanie: " + result);
	}
	
	public static void main(String[] args) {
		System.out.println("Czy chcesz zdefiniowac wartosci przesuniecia szyfru Cezara? (jesli nie program uzyje domyslnych wartosci) [true/false]");
		boolean defin1 = read.nextBoolean();
		if (defin1){
			define_code();
		}
		else {
			a = 3;
			b = 0;
		}
		String exit = "n";
		while (exit == "n"){
			System.out.println("Wybierz zadanie: ");
			System.out.println("1. Szyfracja");
			System.out.println("2. Deszyfracja");
			System.out.println("3. Zmien ustawienia kodu");
			System.out.println("0. Wyjsc");
			System.out.println();
			System.out.println("Podaj numer zadania: ");
			int task = read.nextInt();
			switch (task) {
			case 1:
				code();
				break;
			case 2: 
				decode();
				break;
			case 3:
				define_code();
				break;
			case 0: 
				exit = "y";
				break;
			}
		}
	}
}

