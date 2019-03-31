package Ej2;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Examen> examenesT2 = new ArrayList<Examen>();
		
		Fecha dia1 = new Fecha(28, 2, 2019);
		Hora hora2 = new Hora(10,0);
		Fecha dia2 = new Fecha(5, 3, 2019);
		Hora hora4 = new Hora(12,10);
		Fecha dia3 = new Fecha(6, 3, 2019);
		Hora hora1 = new Hora(9,0);
		Fecha dia4 = new Fecha(7, 3, 2019);
		Fecha dia5 = new Fecha(8, 3, 2019);
		Hora hora5 = new Hora(13,0);
		
				
		Examen examen = new Examen("Bases de Datos", "Robot",dia1,hora2);
		examenesT2.add(examen);
		examen = new Examen("Lenguaje Marcas", "Robot",dia2,hora4);
		examenesT2.add(examen);
		examen = new Examen("Sistemas Informáticos", "Robot",dia3,hora1);
		examenesT2.add(examen);
		examen = new Examen("Programacion", "Robot",dia4,hora2);
		examenesT2.add(examen);
		examen = new Examen("FOL", "Robot",dia5,hora4);
		examenesT2.add(examen);
		examen = new Examen("Entornos de Desarrollo", "Robot",dia5,hora4);
		examenesT2.add(examen);
		
		for(int i=0; i<examenesT2.size();i++){
			System.out.println(examenesT2.get(i).toString());

		}
		
			
		examenesT2.get(4).CambiodeHora(9, 0);
		
		for(int i=0; i<examenesT2.size()-1;i++){
			
			if( examenesT2.get(i).getFecha() ==  examenesT2.get(i+1).getFecha() ){
				System.out.println("Cuidado hay examenes que coinciden!!!");
				System.out.println(examenesT2.get(i).getNombre());
				System.out.println(examenesT2.get(i+1).getNombre());
			}
		}
		
	}

}
