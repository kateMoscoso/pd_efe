package pd_efe.cesta;

public class Prueba {
	public static void main(String[] args) {
		Component a1, a2, a3, a4, a5, a6;
		FactoriaProductos f = FactoriaProductos.getFactoria();
		a1 = f.addArticulo( new Articulo("azucar", 2));
		a2 = f.addArticulo(new Articulo("vino", 15));
		a3 = f.addArticulo(new Articulo("pan", 1));
		a4 = f.addArticulo(new Articulo("campurrianas", 3));
		a5 = f.addArticulo( new Articulo("queso", 25));
		a6 = f.addArticulo(new Articulo("queso", 25)); // no permite introducir mas producto con la misma key
		
		System.out.println(f.toString());
		
		CestaCompra cesta = new CestaCompra("cesta1");
		cesta.add(a1);
		cesta.add(a4);
		System.out.println(cesta.getPrecio());
		CestaCompra cesta2 = new CestaCompra("cesta2");
		cesta2.add(cesta);
		System.out.println(cesta2.getPrecio());
		cesta2.add(a4);
		cesta2.add(a6);
		cesta2.add(a5);
		System.out.println(cesta2.getPrecio());
		System.out.println(cesta2.getNumeroArticulos());
		
	}

}
