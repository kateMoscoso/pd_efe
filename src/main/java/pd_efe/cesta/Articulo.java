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


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String getKey() {
		return nombre;
	}


	@Override
	public boolean isCesta() {
		return false;
	}

    

}