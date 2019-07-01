import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {


		ArrayList<String> lista = new ArrayList<String>();
		lista.add("elemento 1");
		lista.add("elemento 2");
		lista.add("elemento 3");
		lista.add("elemento 2");
		lista.add(4, "elemento 5");
		int x = lista.size();
		
		System.out.println("Cantidad de elementos en lista: " + x);
		System.out.println("Muestra todos los elementos existentes");
		
		Iterator<String> xx = lista.iterator();
		
		while(xx.hasNext())
		{
			String elemento = xx.next();
			System.out.println(elemento);
		}

	}

}
