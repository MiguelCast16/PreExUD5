package Ej1;

public class Empleado {
	
	String nombre;
	String apellido;
	String NIF;
	int edad;
	boolean casado;
	double salario;
	
	
	public Empleado(String nombre, String apellido, String nIF, int edad, boolean casado, double salario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		NIF = nIF;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}


	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
		this.nombre = "";
		this.apellido = "";
		NIF = "";
		this.edad = 0;
		this.casado = false;
		this.salario = 0;
	}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", NIF=" + NIF + ", edad=" + edad + ", casado="
				+ casado + ", salario=" + salario + "]";
	}

	
	public void Clasificacion(){
		/*Si edad es menor o igual a 21, Principiante 
		Si edad es >=22 y <=35, Intermedio 
		Si edad es >35, Senior.-*/

		if(this.edad <= 21)
			System.out.println("Principiante");
		else{
			if(this.edad >= 22 && this.edad <= 35)
				System.out.println("Intermedio");
			else
				System.out.println("Senior");
		}
	}
	
	
	public void Aumento(int porcentaje){
	
		this.salario = this.salario + this.salario * (double)(porcentaje/100);
	
	}
}
