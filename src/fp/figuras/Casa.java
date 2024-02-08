package fp.figuras;


/**
 * Tipo Casa, que representa el dibujo de una casa
 * 
 * @author Toñi Reina
 * @version 1.0.0  22/01/2019
 */
public interface Casa {

	/**
	 * Método que dibuja la casa.
	 */
	void dibujar();

	/**
	 * Cambiar el dibujo de la casa a blanco y negro
	 */
	void setBlancoYNegro();

	/**
	 * Cambia el dibujo de la casa a color
	 */
	void setColor();

}