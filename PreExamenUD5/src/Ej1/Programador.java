package Ej1;

import java.util.ArrayList;

public class Programador extends Empleado {
	
	int lineasDeCodigoPorHora; 
	ArrayList<String> lenguajesProgramacion;
	public Programador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Programador(String nombre, String apellido, String nIF, int edad, boolean casado, double salario) {
		super(nombre, apellido, nIF, edad, casado, salario);
		// TODO Auto-generated constructor stub
		this.lineasDeCodigoPorHora = 0;
		this.lenguajesProgramacion = new ArrayList<String>();
	}
	
	
	public Programador(String nombre, String apellido, String nIF, int edad, boolean casado, double salario,
			int lineasDeCodigoPorHora) {
		super(nombre, apellido, nIF, edad, casado, salario);
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		this.lenguajesProgramacion = new ArrayList<String>();
	} 
	
	
	public void AddLanguaje(String nuevoLenguaje){
		this.lenguajesProgramacion.add(nuevoLenguaje);
	}
	
	@Override
	public String toString() {
		return "Programador [lineasDeCodigoPorHora=" + lineasDeCodigoPorHora + ", lenguajesProgramacion="
				+ lenguajesProgramacion + ", nombre=" + nombre + ", apellido=" + apellido + ", NIF=" + NIF + ", edad="
				+ edad + ", casado=" + casado + ", salario=" + salario + "]";
	}
	
	
	

}
