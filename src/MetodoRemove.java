import java.util.Collection;
import java.util.ArrayList;

public class MetodoRemove {
	public static void main(String[] args) {
		Collection<Integer> fila = new ArrayList();
		fila.add(255);
		fila.add(312);
		fila.add(883);
		fila.add(122);
		fila.add(9);
		
		System.out.println(“Valores da fila: ”+fila);
	
		fila.remove(312); //REMOVE OBJETO 312
		//removendo elemento da posição 2
	
		System.out.println(“Valores atualizados da fila:”+fila);
	}
	
} 

//Usando o método limpar "clear".
public class MetodoRemove {
	public static void main(String[] args) {
		Collection<String> livros = new ArrayList();
		livros.add("Java");
		livros.add("Php");
		livros.add("Python");
		livros.add("SQL");
		
		System.out.println("Listagem dos Livros: "+livros);

		livros.clear();

		System.out.println("Listagem após o clear: "+livros);

	}
}
