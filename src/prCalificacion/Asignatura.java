/** @author Juan Miguel Ortiz de Lazcano
 *  @version Version 1
 */
package prCalificacion;

public class Asignatura {
	private double[] notas;
	private String nombre;
	private Media media;

	public static enum Calificacion {
		MATRICULA_HONOR, SOBRESALIENTE, NOTABLE, APROBADO, SUSPENSO
	};

	/**
	 * @param nombre
	 *            Nombre del alumno
	 * @param notas
	 *            Notas del alumnos
	 * @param c
	 *            Forma de calcular la media
	 */
	public Asignatura(String nombre, double[] notas, Media c) {
		this.nombre = nombre;
		this.notas = notas;
		media = c;
	}

	/**
	 * @param nombre
	 *            Nombre del alumno
	 * @param notas
	 *            Notas del alumnos
	 */
	public Asignatura(String nombre, double[] notas) {
		this.nombre = nombre;
		this.notas = notas;
		media = new MediaAritmetica();
	}

	/**
	 * Devuelve la calificacion correspondiente a las notas almacenadas en la
	 * clase.
	 * 
	 * @return La calificación
	 */
	public Calificacion calificacion() {
		double m = media.calcular(notas);
		Calificacion calificacion = Calificacion.SUSPENSO;
		if (m >= 9.5) {
			calificacion = Calificacion.MATRICULA_HONOR;
		} else if (m >= 8.5) {
			calificacion = Calificacion.SOBRESALIENTE;
		} else if (m >= 7) {
			calificacion = Calificacion.NOTABLE;
		} else if (m > 5) {
			calificacion = Calificacion.APROBADO;
		}

		return calificacion;
	}

	public String toString() {
		return nombre + "--> " + calificacion() + "(" + media.calcular(notas) + ")";
	}
}
