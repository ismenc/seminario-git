import java.util.ArrayList;
import java.util.Iterator;

public class Historial {
		
	/* ----------------------- CONSTANT ------------------------ */
	
	
	
	/* ----------------------- ATRIBUTES ----------------------- */
	
	private ArrayList<Entrada> historialWeb;
	
	/* ---------------------- CONSTRUCTOR ---------------------- */
	
	public Historial(){
		historialWeb = new ArrayList<Entrada>();
	}
	
	/* ------------------------ GETTER ------------------------- */
	
	
	
	/* ------------------------ SETTER ------------------------- */
	
	
	
	/* --------------------- CLASS - OTHER --------------------- */
	
	public String toString(){
		StringBuilder cadena = new StringBuilder(300);
		Iterator<Entrada> iterador = historialWeb.iterator();
		
		while(iterador.hasNext()){
			cadena.append(iterador.next());
			cadena.append("\n");
		}
		
		return cadena.toString();
	}
	
	/* ------------------------ METHODS ------------------------ */

	/**
	 * 
	 * @param newEntry
	 * @throws HistorialException
	 */
	public void addEntry(Entrada newEntry) throws HistorialException {
		Entrada entrada = null;
		
		entrada = historialWeb.get(historialWeb.size() - 1);
		
		if(entrada != null)
			if(newEntry.getHoraAcceso().compareTo(entrada.getHoraAcceso()) != 1)
				throw new HistorialException("Error. La entrada es vieja");
		
		historialWeb.add(newEntry);
	}
	
	/**
	 * 
	 */
	public void empty(){
		historialWeb.clear();
	}
	
	/**
	 * 
	 * @param day
	 * @return
	 */
	public String listDay(int day){
		Iterator<Entrada> iterador = historialWeb.iterator();
		Entrada entrada = null;
		StringBuilder cadena = new StringBuilder(200);
		
		while(iterador.hasNext()){
			entrada = iterador.next();
			if(entrada.getHoraAcceso().getDayOfMonth() == day){
				cadena.append(entrada);
				cadena.append("\n");
			}
		}
		
		return cadena.toString();
	}
}

