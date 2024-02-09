package fp.figuras;

/**
 * Clase que implementa el dibujo de una casa. Una casa tiene una pared, una ventana, un tejado y un sol
 * @author Toñi Reina
 * @version 1.0.0 del 22/01/2018
 */
public class CasaImpl implements Casa {
	private Cuadrado pared;
    private Cuadrado ventana;
    private Triangulo tejado;
    private Circulo sol;
    private Monigote monigote;

    /**
     * Constructor por defecto de la clase CasaImpl
     */
    public CasaImpl()
    {
        pared = new CuadradoImpl();
        ventana = new CuadradoImpl();
        tejado = new TrianguloImpl();
        sol = new CirculoImpl();
        monigote = new MonigoteImpl();
    }

    /* (non-Javadoc)
	 * @see fp.figuras.Casa#dibujar()
	 */
    @Override
	public void dibujar()
    {
    	pared.moverHorizontalmente(-140);
    	pared.moverVerticalmente(20);
    	pared.cambiarTamanyo(120);
    	pared.hacerVisible();

    	ventana.cambiarColor("black");
    	ventana.moverHorizontalmente(-120);
    	ventana.moverVerticalmente(40);
    	ventana.cambiarTamanyo(40);
    	ventana.hacerVisible();
    	
        tejado.cambiarTamanyo(60, 180);
        tejado.moverHorizontalmente(20);
        tejado.moverVerticalmente(-60);
        tejado.hacerVisible();

        sol.cambiarColor("yellow");
        sol.moverHorizontalmente(100);
        sol.moverVerticalmente(-40);
        sol.cambiarTamanyo(80);
        sol.hacerVisible();
        
        
        monigote.cambiarColor("blue");
        monigote.moverHorizontalmente(-160);
        monigote.moverVerticalmente(25);
        monigote.cambiarTamanyo(60, 90);
        monigote.hacerVisible();
    }

    /* (non-Javadoc)
	 * @see fp.figuras.Casa#setBlancoYNegro()
	 */
    @Override
	public void setBlancoYNegro()
    {
            pared.cambiarColor("black");
            ventana.cambiarColor("white");
            tejado.cambiarColor("black");
            sol.cambiarColor("black");
            monigote.cambiarColor("black");
    }

    /* (non-Javadoc)
	 * @see fp.figuras.Casa#setColor()
	 */
    @Override
	public void setColor()
    {
           pared.cambiarColor("red");
           ventana.cambiarColor("black");
           tejado.cambiarColor("green");
           sol.cambiarColor("yellow");
           monigote.cambiarColor("blue");
    }

    
    public void setAtardecer() {
    	
    	sol.moverHorizontalmenteDespacio(-100);
    	
    	sol.moverVerticalmenteDespacio(90);
    	sol.moverHorizontalmenteDespacio(-50);
    	setBlancoYNegro();
    	
    	
    }
    
 public void setAtardecer2() {
	 	sol.moverHorizontalmente(100);
	 	sol.moverVerticalmente(-90);
	 	setColor();
    	sol.moverHorizontalmenteDespacio(230);

    	setBlancoYNegro();
    	
    	
    }
}
