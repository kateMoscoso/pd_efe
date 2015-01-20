package pd_efe.cesta;

import java.util.HashMap;
import java.util.Map;

public class CestaCompra extends Cesta {

	//Map<String, Component> cesta = new HashMap<String, Component>();
	String idCesta;

	public  CestaCompra(String idCesta) {
		super();
		this.idCesta = idCesta;
		
	}
	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return idCesta;
	}

	@Override
	public int getPrecio() {
		int acumulador = 0;
		for (Component a : conjuntoComponentes) {
			acumulador +=a.getPrecio();
		}
		return acumulador;
	}
	
	public int getNumeroArticulos(){
		int acumulador = 0;
		for (Component a : conjuntoComponentes) {
				acumulador+=a.getNumeroArticulos();
		}
		return acumulador;
	}

	
}
