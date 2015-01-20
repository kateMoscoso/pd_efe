package pd_efe.cesta;


public class CestaCompra extends Cesta {

	private String idCesta;

	public  CestaCompra(String idCesta) {
		super();
		this.idCesta = idCesta;
		
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
