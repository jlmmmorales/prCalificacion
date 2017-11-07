/** @author Juan Miguel Ortiz de Lazcano
 *  @version Version 1
 */

import prCalificacion.Asignatura;
import prCalificacion.MediaConUmbral;
//import prCalificacion.MediaPonderada;
import prCalificacion.MediaPonderada;


public class TestNotas {
	public static void main(String[] args){
		
		double [] notas1 = {3.8,7.4,5.3};
		Asignatura bd =new Asignatura("Bases de Datos",notas1);
					
		double [] notas2 = {9,2.5,9,7};
		Asignatura poo = new Asignatura("POO",notas2, new MediaConUmbral(2.6));
		
		double [] notas3 = {10,8,6,4,1};
		double [] pesos = {0.15,0.15,0.3,0.2,0,2};
		Asignatura ec = new Asignatura("Estructuras de Datos",notas3, new MediaPonderada(pesos));
		
		
		System.out.println(bd);
		System.out.println(poo);
		System.out.println(ec);
	}
}
