package Ej2;

public class Examen {
	
	String nombre;
	String aula;
	Fecha fecha;
	Hora hora;
	public Examen(String nombre, String aula, Fecha fecha, Hora hora) {
		super();
		this.nombre = nombre;
		this.aula = aula;
		this.fecha = fecha;
		this.hora = hora;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	public Fecha getFecha() {
		return fecha;
	}
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	public Hora getHora() {
		return hora;
	}
	public void setHora(Hora hora) {
		this.hora = hora;
	}
	@Override
	public String toString() {
		return "Examen [nombre=" + nombre + ", aula=" + aula + ", fecha=" + fecha + ", hora=" + hora + "]";
	}
	
	
	public void CambiodeFecha(int dia, int mes, int año){
		
		int[] meses = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(mes < 1 || mes > 12){
			System.out.println("Mes no valido!!");
		}
		else{
		
			if(dia > meses[mes-1])
				System.out.println("Dia no valido para ese mes!!");
		
			else{
				this.fecha.setAño(año);
				this.fecha.setMes(mes);
				this.fecha.setDia(dia);
			}
		}
		
	}
	
	public void CambiodeHora(int hora, int minutos){
		
		if( hora < 9 || hora > 14 )
			System.out.println("Hora no valida!!");
		else{
	
			if(minutos > 59 || minutos < 0)
				System.out.println("Hora no valida");
			else{
				this.hora.setHoras(hora);
				this.hora.setMinutos(minutos);
			}
		}
	
	}
}
