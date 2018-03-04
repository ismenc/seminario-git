import java.time.LocalDateTime;

public class Entrada {
		
	/* ----------------------- CONSTANT ------------------------ */
	
	
	
	/* ----------------------- ATRIBUTES ----------------------- */
	
	private String url;
	private LocalDateTime horaAcceso;
	
	/* ---------------------- CONSTRUCTOR ---------------------- */
	
	public Entrada(String web){
		url = new String(web);
		horaAcceso = LocalDateTime.now();
	}

	/* ------------------------ GETTER ------------------------- */
	
	public String getUrl() {
		return url;
	}

	public LocalDateTime getHoraAcceso() {
		return horaAcceso;
	}
	
	/* ------------------------ SETTER ------------------------- */
	
	
	
	/* --------------------- CLASS - OTHER --------------------- */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((horaAcceso == null) ? 0 : horaAcceso.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	public boolean equals(Entrada otra) {
		boolean sonIguales = false;
		
		if(this.url.equals(otra.url) /*&& this.horaAcceso.equals(otra.horaAcceso)*/)
			sonIguales = true;
		
		return sonIguales;
	}
	
	public String toString(){
		// DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/uuuu hh:mm");
		//syso(df.format(horaAcceso))
		return "<font color=\"blue\">" + url + "</font> a las " + horaAcceso.getHour() + ":" + horaAcceso.getMinute() +
				" del " + horaAcceso.getDayOfMonth() + "/" + horaAcceso.getMonthValue();
		}
	
	/* ------------------------ METHODS ------------------------ */

}

