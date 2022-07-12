package clases;

import java.util.ArrayList;
import java.util.List;

public class SistemaSolar {
	private String nombre;
	private List<Planeta> lista;
	
	public SistemaSolar (String nombre) {
		this.nombre=nombre;
		this.lista=new ArrayList<Planeta>();
		
	}
	
	
	public SistemaSolar() {
		this.lista=new ArrayList<>();
	}


	public void a�adirPlaneta(Planeta p) {
		if (!lista.contains(p)) {
			lista.add(p);
		}
	}

	public boolean eliminarPlaneta (Planeta p) {
			return lista.remove(p);
	}
	
	public void eliminarPlanetas() {
		lista.clear();
	}
	
	// M�todo para saber el numero de planetas que hay en la lista
	public int getNumPlanetas() {
		return lista.size();
	}
	//M�todo para modificar un planeta
	public boolean modificarPlaneta(Planeta p) {
		int pos = lista.indexOf(p);
		if (pos!=-1) {
			lista.set(pos, p);
			return true;
		}
		return false;
	}
	
	// M�todo buscar un planeta
	public Planeta buscarPlaneta(Planeta p) {
		int pos = lista.indexOf(p);
		if(pos!=-1) {
			return lista.get(pos);
		}
		return null;
	}
	
	// M�todo planeta mas denso de toda la lista
	public Planeta planetaMasDenso() {
		Planeta denso = lista.get(0);
		for (Planeta planeta : lista) {
			if(planeta.densidadPlaneta()>denso.densidadPlaneta()) {
				denso=planeta;
			}
		}
		return denso;
	}
	// M�todo masa media de todos los planetas
		public double masaMediaPlanetas() {
			double masas=0;
			for (Planeta planeta : lista) {
				masas=masas + planeta.getMasa_kg();
				}
			return masas/lista.size();
			}
		
	@Override
	public String toString() {
		String res="Sistema: "+this.nombre+"\n";
		for (Planeta planeta : lista) {
			res=res+planeta+"\n";
		}
		return res;	
		
	}
	
	
	
	 
}

