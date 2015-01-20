package pd_efe.cesta;


public class Articulo extends Component {
	private int precio;
	private String nombre;
	

    public Articulo(String nombre, int precio) {
    	this.nombre = nombre;
    	this.precio = precio;
    }


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}



	public String getNombre() {
		return nombre;
	}


	@Override
	public int getNumeroArticulos() {
		// TODO Auto-generated method stub
		return 1;
	}


	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		
	}

    

}
