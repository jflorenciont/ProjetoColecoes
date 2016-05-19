import java.util.Collection; 
import java.util.ArrayList;

public class MetodoAdd {
	public static void main(String[] args) {
	//Adicionando nomes[Strings] no ArrayList.
		Collection<String> nomes = new ArrayList();
		nomes.add("João");
		nomes.add("Maria");
		nomes.add("Eduardo");
		nomes.add("Silvana");
		nomes.add("Mário");
		
		System.out.println(“Lista de nomes: ”+nomes);
	}
}
