package fp.figuras;

public class TestCasa {
	
	public static void testdibujar(Casa c) {
		
		c.dibujar();
		
	}
	
public static void testsetBlancoYNegro(Casa c) {
		
		c.setBlancoYNegro();
		
	}

public static void testsetColor(Casa c) {
	
	c.setColor();
	
}

public static void testsetAtardecer(Casa c) {
	
	c.setAtardecer();
	
}
public static void testsetAtardecer2(Casa c) {
	
	c.setAtardecer2();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	CasaImpl c= new CasaImpl();
	
	testdibujar(c);
	testsetBlancoYNegro(c);
	testsetColor(c);
	testsetAtardecer(c);
	testsetAtardecer2(c);
	}
	
}
