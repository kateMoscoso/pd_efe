package pd_efe.cesta;

public class Prueba {
	public static void main(String[] args) {
		Articulo a1 = new Articulo("azucar", 2);
		Articulo a2 = new Articulo("pan", 1);
		Articulo a3 = new Articulo("campurrianas", 3);
		Articulo a4 = new Articulo("vino", 15);
		Articulo a5 = new Articulo("queso", 25);
		FactoriaProductos f = FactoriaProductos.getFactoria();
		f.addArticulo( a1);
		f.addArticulo(a2);
		f.addArticulo( a3);
		f.addArticulo( a4);
		f.addArticulo( a5);
		f.addArticulo(a5); // no permite introducir mas producto con la misma key
		
		System.out.println(f.toString());
		
		CestaCompra cesta = new CestaCompra("cesta1");
		cesta.add(a1);
		cesta.add(a4);
		System.out.println(cesta.getPrecio());
		CestaCompra cesta2 = new CestaCompra("cesta2");
		cesta2.add(cesta);
		System.out.println(cesta2.getPrecio());
		cesta2.add(a4);
		System.out.println(cesta2.getPrecio());
		System.out.println(cesta2.getNumeroArticulos());
		
	}

}
