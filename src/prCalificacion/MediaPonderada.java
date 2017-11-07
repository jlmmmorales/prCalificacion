package prCalificacion;
/** @author Jose Luis Martin Morales
 *  @version Version 1
 */

public class MediaPonderada implements Media {
	private double [] pesos;

	public MediaPonderada(double [] p) {
		pesos = p;
	}

	@Override
	public double calcular(double[] notas) {
		double notaFinal = 0.0;
		if(notas.length > pesos.length){
			throw new RuntimeException("ERROR: Faltan pesos para calificar");
		}
		
		for(int i=0; i<notas.length; i++){
			//System.out.println(notas[i]+","+pesos[i]);
			notaFinal = notaFinal + ( notas[i] * pesos[i]);
		}
		return notaFinal;
	}

}
