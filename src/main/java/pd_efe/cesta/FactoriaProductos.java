package pd_efe.cesta;

import java.util.HashMap;
import java.util.Map;

public class FactoriaProductos {
	private Map<String, Articulo> articulos;
	private static FactoriaProductos factoriaProductos;
	private FactoriaProductos() {
		this.articulos = new HashMap<String, Articulo>();
	}
	public static FactoriaProductos getFactoria() {
		if (factoriaProductos == null) {
			factoriaProductos = new FactoriaProductos();
		}
		return factoriaProductos;
	}
	
	public Articulo addArticulo(Articulo a) {
		Articulo result = this.articulos.get(a.getNombre());
		if (result == null) {
			this.articulos.put(a.getNombre(), a);
			return a;
		}
		return result;
	}
	public void removeReference(String key) {
		this.articulos.remove(key);
		
	}
	public String toString(){
		String cadena = "";
		for(Articulo a : articulos.values()){
			cadena += "Nombre: " + a.getNombre() + " Precio: "+ a.getPrecio() + "\n";
		}
		return cadena;
	}

}
