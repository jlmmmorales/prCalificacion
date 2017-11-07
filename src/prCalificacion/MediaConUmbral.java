/** @author Jose Luis Martin Morales
 *  @version Version 1
 */
package prCalificacion;

public class MediaConUmbral implements Media {
	private double umbral = 0.0;
	
	public MediaConUmbral(double u){
		umbral = u;
	}

	/**
	 * Calcula la media aritmética de las notas
	 * Pero si alguna es inferior al umbral entonces la nota final cera cero
	 */
	@Override
	public double calcular(double[] notas) {
		int numeroDeNotas = notas.length;
		double sumaNotas = 0.0;
		boolean condicion = true;
		
		for(double n : notas){
			if(n < umbral){
				condicion = false;
			}
			sumaNotas = sumaNotas + n;
		}
		
		double media = 0.0;
		if (condicion){
			media = sumaNotas / numeroDeNotas;
		}
		return media;
	}

}
