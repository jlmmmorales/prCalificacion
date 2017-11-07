/** @author Jose Luis Martin Morales
 *  @version Version 1
 */
package prCalificacion;

public class MediaAritmetica implements Media {

	@Override
	public double calcular(double[] notas) {
		int numeroDeNotas = notas.length;
		double sumaNotas = 0.0;
		for(double n : notas){
			sumaNotas = sumaNotas + n;
		}
		return sumaNotas / numeroDeNotas;
	}

}
