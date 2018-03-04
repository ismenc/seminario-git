
import java.util.Scanner;

public class Main {
	private static Scanner keyboard = new Scanner(System.in);
	
	/* ----------------------- CONSTANT ----------------------- */

	public static void main(String[] args) {
		
		Historial historial = new Historial();
		
		try{
			historial.addEntry(new Entrada("www.allahu-akbar.boom"));
			keyboard.nextLine();
			historial.addEntry(new Entrada("asds.ar"));
		}catch(HistorialException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println(historial);
		System.out.println("------------------------------------");
		
		keyboard.nextLine();
		try{
			historial.addEntry(new Entrada("xxx.guarrerias.com"));
		}catch(HistorialException e){
			System.out.println(e.getMessage());
		}
		System.out.println(historial);
		System.out.println("------------------------------------");
		
		historial.empty();
		System.out.println(historial);
	}
	
	/* ------------------------ METHODS ------------------------ */

}