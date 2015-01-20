package pd_efe.cesta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public abstract class Cesta extends Component {
	protected List<Component> conjuntoComponentes ;

	 public Cesta() {
		this.conjuntoComponentes = new ArrayList<Component>();
	}
	public void add(Component c){
		if(c!= null){
			this.conjuntoComponentes.add(c);
		}
	}


	@Override
	public abstract int getPrecio();

	public abstract int getNumeroArticulos();

	
}
