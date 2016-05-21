import java.util.Collection; 
import java.util.ArrayList;

public class Metodo_estahVazio {
	public static void main(String[] args) {
		Collection<String> letras = new ArrayList();
		letras.add("A");
		letras.add("B");
		letras.add("C");
		letras.add("D");
		letras.add("E");
		letras.add("F");
		
		if(letras.estahVazio()){
			System.out.println("Lista Vazia!");
		}else{
			System.out.println("Contém valores -> "+letras);
		}
	}
}
