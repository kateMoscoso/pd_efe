package pd_efe.cesta;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class PruebaTest {
	private Component p1, p2, p3, p4, p5, p6;
	private Component c1, c2;


    @Before
    public void ini() {

    	p1 = FactoriaProductos.getFactoria().addArticulo(new Articulo("azucar", 2));
    	p2 = FactoriaProductos.getFactoria().addArticulo(new Articulo("pan", 1));
    	p3 = FactoriaProductos.getFactoria().addArticulo( new Articulo("campurrianas", 3));
    	p4 = FactoriaProductos.getFactoria().addArticulo( new Articulo("vino", 15));
    	p5 = FactoriaProductos.getFactoria().addArticulo( new Articulo("queso", 25));
    	p6 = FactoriaProductos.getFactoria().addArticulo(new Articulo("azucar", 5));
    	c2 = new CestaCompra("cesta2");
    	c2.add(p1);
        c2.add(p3);
        c1 = new CestaCompra("cesta1");
        c1.add(c2);
        c1.add(p4);
        c1.add(p5);
        c1.add(p5);
    }

    @Test
    public void testNumeroArticulosC2() {
    	
        assertEquals(2,c2.getNumeroArticulos());
    }

    @Test
    public void testNumeroArticulosC() {
    	
        assertEquals(5,c1.getNumeroArticulos());
    }
    @Test
    public void testValorCesta1() {
    	
        assertEquals(70,c1.getPrecio());
    }
    
    @Test
    public void testValorCesta2() {
    	
        assertEquals(5,c2.getPrecio());
    }
    
    @Test
    public void testValorP6() {
    	
        assertEquals(2,p6.getPrecio());
    }


 

}
