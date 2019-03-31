package Ej1;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Programador programador1 = new Programador("Miguel", "Del Castillo","1234567P", 19, false, 999.99,120);
		Programador programador2 = new Programador("Francisco", "Morales","22222222T", 19, false, 1001.99,110);
		Programador programador3 = new Programador("Laura", "Kim","33423414R", 21, false,1100.03,140);
		
		programador1.AddLanguaje("Java");
		programador2.AddLanguaje("Java");
		programador3.AddLanguaje("Java");
		programador3.AddLanguaje("JavaScript");
		
		System.out.println(programador1.toString());
		System.out.println(programador2.toString());
		System.out.println(programador3.toString());
	}

}
