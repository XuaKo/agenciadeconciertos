package entidades;
import java.util.ArrayList;

public class Generar_Arrays<A> {
	public A obj;
	
	public Generar_Arrays() {
		
	}

	 public Generar_Arrays(A o) {
	        obj = o;
	    }

	    public A get() {
	        return obj;
	    }

	    public void set(A a) {
	        this.obj = a;
	    }

	    public void classType() {
	        System.out.println("El tipo de clase es " + obj.getClass().getName());
	    }

	    public final ArrayList<A> convertir(A[] array) {
	        ArrayList<A> ret = new ArrayList<A>();
	        for (A a : array) {
	            ret.add((A) a);
	        }
	        return ret;
	    }
}
